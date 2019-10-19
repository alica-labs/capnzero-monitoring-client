package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.SubscribeEvent;

import java.util.Map;

public class SubscribeEventFactory extends DebugEventFactory
{
  public SubscribeEventFactory()
  {}

  @Override
  public SubscribeEvent buildFromString( Map<String, Object> serializedEvent )
  {
    String id = DebugEventFactory.parseId(serializedEvent.get("id"));
    return new SubscribeEvent(id);
  }
}
