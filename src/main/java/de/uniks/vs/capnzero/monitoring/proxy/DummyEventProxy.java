package de.uniks.vs.capnzero.monitoring.proxy;

import de.uniks.vs.capnzero.monitoring.event.CreateEvent;
import de.uniks.vs.capnzero.monitoring.handler.DebugEventHandler;

public class DummyEventProxy {
  private Thread eventThread;
  private DebugEventHandler eventHandler;

  public DummyEventProxy() {
    this.eventThread = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        eventHandler.handleDebugEvent(new CreateEvent());
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
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

  public void addEventHandler(DebugEventHandler handler) {
    this.eventHandler = handler;
  }

}
