package de.uniks.vs.capnzero.monitoring.event;

public class TopicEvent implements DebugEvent
{
  private final String type;
  private final String topic;

  public TopicEvent( String topic )
  {
    this.type = "topic";
    this.topic = topic;
  }

  public String getType()
  {
    return type;
  }

  public String getTopic()
  {
    return topic;
  }
}
