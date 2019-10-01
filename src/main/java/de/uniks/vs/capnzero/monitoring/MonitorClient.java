package de.uniks.vs.capnzero.monitoring;

import de.uniks.vs.capnzero.monitoring.proxy.DummyEventProxy;

public class MonitorClient {

  private DummyEventProxy eventProxy;
  private boolean running;

  public MonitorClient(DummyEventProxy proxy) {
    this.eventProxy = proxy;
    this.running = false;
  }

  public void start() {
    this.eventProxy.startListening();
    this.running = true;
  }

  public void stop() {
    this.eventProxy.stopListening();
    this.running = false;
  }

  public boolean isRunning() {
    return running;
  }
}
