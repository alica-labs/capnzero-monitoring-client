package de.uniks.vs.capnzero.monitoring;

import org.junit.Test;

import de.uniks.vs.capnzero.monitoring.event.Event;
import de.uniks.vs.capnzero.monitoring.proxy.DummyEventProxy;
import de.uniks.vs.capnzero.monitoring.proxy.EventProxy;

public class MonitorClientTest {
  public MonitorClientTest() {
  }

  @Test
  public void testMonitorclient() {
    EventProxy proxy = new DummyEventProxy();
    MonitorClient client = new MonitorClient(proxy);
    client.start();

    while (client.hasEvent()) {
      Event event = client.nextEvent();
      System.out.println(event);
    }

    client.stop();
  }
}