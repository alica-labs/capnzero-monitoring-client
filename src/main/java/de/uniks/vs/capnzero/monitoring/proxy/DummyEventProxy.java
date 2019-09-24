package de.uniks.vs.capnzero.monitoring.proxy;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import de.uniks.vs.capnzero.monitoring.event.CreateEvent;
import de.uniks.vs.capnzero.monitoring.event.Event;
import de.uniks.vs.capnzero.monitoring.handler.DebugEventHandler;

public class DummyEventProxy implements DebugEventProxy, DebugEventListener {
  private Thread eventThread;
  private DebugEventHandler eventHandler;

  public DummyEventProxy() {
    this.eventThread = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        this.notify(new CreateEvent());
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
      }
    });
  }

  @Override
  public void startListening() {
    System.out.println("Start listening on dummy");
    eventThread.start();
  }

  @Override
  public void stopListening() {
    System.out.println("Stop listening on dummy");
    eventThread.interrupt();
  }

  @Override
  public void addEventHandler(DebugEventHandler handler) {
    this.eventHandler = handler;
  }

  @Override
  public void notify(Event event) {
    this.eventHandler.handleDebugEvent(event);
  }
}
