package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.TopicEvent;

import java.util.Map;

public class TopicEventFactory implements DebugEventFactory
{
  public TopicEventFactory()
  {
  }

  @Override
  public TopicEvent buildFromString( Map<String, String> serializedEvent )
  {
    return new TopicEvent(serializedEvent.get("topic"));
  }
}
