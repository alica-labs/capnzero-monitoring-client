package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.SubscribeEvent;

import java.util.Map;

public class SubscribeEventFactory implements DebugEventFactory
{
  public SubscribeEventFactory()
  {}

  @Override
  public SubscribeEvent buildFromString( Map<String, String> serializedEvent )
  {
    return new SubscribeEvent();
  }
}
