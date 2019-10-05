package de.uniks.vs.capnzero.monitoring.proxy;

import de.unikassel.vs.pdDebug.Protocol;
import de.unikassel.vs.pdDebug.Subscriber;
import de.uniks.vs.capnzero.monitoring.EventParser;
import de.uniks.vs.capnzero.monitoring.InvalidEventException;
import de.uniks.vs.capnzero.monitoring.config.DebugConfiguration;
import de.uniks.vs.capnzero.monitoring.event.DebugEvent;
import de.uniks.vs.capnzero.monitoring.handler.DebugEventHandler;

public class CapnzeroEventProxy {
  private DebugEventHandler eventHandler;
  private Subscriber subscriber;
  private DebugConfiguration configuration;
  private Thread eventThread;
  private EventParser eventParser;

  public CapnzeroEventProxy(DebugEventHandler handler, EventParser parser, DebugConfiguration config) {
    this.eventHandler = handler;
    this.eventParser = parser;
    this.configuration = config;
    this.subscriber = new Subscriber();
    subscriber.setGroupName(configuration.getTopic());
    subscriber.subscribe(Protocol.UDP, configuration.getAddress());

    eventThread = new Thread(() -> {
      while (true) {
        String message = subscriber.getMessage();

        try
        {
          DebugEvent event = eventParser.parse(message);
          eventHandler.handleDebugEvent(event);
        } catch( InvalidEventException e )
        {
          System.out.println(e.getMessage());
          continue;
        }
      }
    });
  }

  public void startListening() {
    System.out.println("Start listening on dummy");

    eventThread.start();
  }

  public void stopListening() {
    System.out.println("Stop listening on dummy");

    eventThread.interrupt();
  }
}
