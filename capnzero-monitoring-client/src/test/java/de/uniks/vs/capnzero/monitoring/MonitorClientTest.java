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
    MonitorClient client = new MonitorClient(handler);

    client.start();

    Thread.sleep(20000);

    client.stop();
  }
}