package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.ReceiveEvent;

import java.util.Map;

public class ReceiveEventFactory extends DebugEventFactory
{
  public ReceiveEventFactory(){}

  @Override
  public ReceiveEvent buildFromString( Map<String, Object> serializedEvent )
  {
    String id = DebugEventFactory.parseId(serializedEvent.get("id"));
    String message = (String) serializedEvent.get("message");
    return new ReceiveEvent(id, message);
  }
}
