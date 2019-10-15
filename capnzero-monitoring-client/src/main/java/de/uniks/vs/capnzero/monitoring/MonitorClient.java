package de.uniks.vs.capnzero.monitoring;

import de.uniks.vs.capnzero.monitoring.config.DebugConfiguration;
import de.uniks.vs.capnzero.monitoring.handler.DebugEventHandler;
import de.uniks.vs.capnzero.monitoring.proxy.CapnzeroEventProxy;

public class MonitorClient {

  private CapnzeroEventProxy eventProxy;
  private boolean running;

  public MonitorClient(DebugEventHandler handler)
  {
    EventParser parser = new YamlEventParser();
    DebugConfiguration config = new DebugConfiguration();
    this.eventProxy = new CapnzeroEventProxy(handler, parser, config);
    this.running = false;
  }

  public MonitorClient(CapnzeroEventProxy proxy) {
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
