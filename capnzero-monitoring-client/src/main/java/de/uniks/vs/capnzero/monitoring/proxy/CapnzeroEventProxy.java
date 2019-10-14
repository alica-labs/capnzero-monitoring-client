package de.uniks.vs.capnzero.monitoring.proxy;

import de.unikassel.vs.pdDebug.Protocol;
import de.unikassel.vs.pdDebug.Subscriber;
import de.uniks.vs.capnzero.monitoring.EventParser;
import de.uniks.vs.capnzero.monitoring.exception.InvalidEventException;
import de.uniks.vs.capnzero.monitoring.config.DebugConfiguration;
import de.uniks.vs.capnzero.monitoring.event.DebugEvent;
import de.uniks.vs.capnzero.monitoring.handler.DebugEventHandler;

public class CapnzeroEventProxy {
  private boolean running;
  private DebugEventHandler eventHandler;
  private Subscriber subscriber;
  private DebugConfiguration configuration;
  private EventParser eventParser;

  public CapnzeroEventProxy(DebugEventHandler handler, EventParser parser, DebugConfiguration config) {
    this.eventHandler = handler;
    this.eventParser = parser;
    this.configuration = config;
    this.subscriber = new Subscriber();
    this.running = false;
    subscriber.setGroupName(configuration.getTopic());
    subscriber.subscribe(Protocol.UDP, configuration.getAddress());
  }

  public void startListening() {
    this.running = true;

    Thread eventThread = new Thread(() -> {
      while (this.running) {
        String message = subscriber.getMessage();

        try
        {
          DebugEvent event = eventParser.parse(message);
          eventHandler.handleDebugEvent(event);
        } catch( InvalidEventException e )
        {
          System.err.println(e.getMessage());
          continue;
        }
      }
    });

    eventThread.start();
  }

  public void stopListening() {
    running = false;
  }
}
