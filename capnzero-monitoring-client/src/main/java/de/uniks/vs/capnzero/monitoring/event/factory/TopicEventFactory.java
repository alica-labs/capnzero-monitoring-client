package de.uniks.vs.capnzero.monitoring.event.factory;

import de.uniks.vs.capnzero.monitoring.event.TopicEvent;
import java.util.Map;

public class TopicEventFactory extends DebugEventFactory
{
  public TopicEventFactory()
  {
  }

  @Override
  public TopicEvent buildFromString( Map<String, Object> serializedEvent )
  {
    String id = DebugEventFactory.parseId(serializedEvent.get("id"));

    String topic = (String) serializedEvent.get("topic");
    return new TopicEvent(id, topic);
  }
}
