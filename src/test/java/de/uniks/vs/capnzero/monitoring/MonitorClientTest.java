package de.uniks.vs.capnzero.monitoring;

import org.junit.Test;

import de.uniks.vs.capnzero.monitoring.event.Event;
import de.uniks.vs.capnzero.monitoring.handler.DebugEventHandler;
import de.uniks.vs.capnzero.monitoring.handler.PrintDebugEventHandler;
import de.uniks.vs.capnzero.monitoring.proxy.DummyEventProxy;

public class MonitorClientTest {
  public MonitorClientTest() {
  }

  @Test
  public void testMonitorclient() throws InterruptedException {
    DummyEventProxy proxy = new DummyEventProxy();
    DebugEventHandler handler = new PrintDebugEventHandler();
    proxy.addEventHandler(handler);

    MonitorClient client = new MonitorClient(proxy);

    client.start();

    Thread.sleep(5000);

    client.stop();
  }
}