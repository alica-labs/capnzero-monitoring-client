package de.uniks.vs.capnzero.monitoring;

import org.junit.Test;

import de.uniks.vs.capnzero.monitoring.config.DebugConfiguration;
import de.uniks.vs.capnzero.monitoring.handler.DebugEventHandler;
import de.uniks.vs.capnzero.monitoring.handler.PrintDebugEventHandler;
import de.uniks.vs.capnzero.monitoring.proxy.CapnzeroEventProxy;

public class MonitorClientTest {
  public MonitorClientTest() {
  }

  @Test
  public void testMonitorClientWithCapnzero() throws InterruptedException {
    DebugEventHandler handler = new PrintDebugEventHandler();
    EventParser parser = new YamlEventParser();
    DebugConfiguration config = new DebugConfiguration();
    CapnzeroEventProxy proxy = new CapnzeroEventProxy(handler, parser, config);

    MonitorClient client = new MonitorClient(proxy);

    client.start();

    Thread.sleep(10000);

    client.stop();
  }
}