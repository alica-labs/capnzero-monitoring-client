package de.uniks.vs.capnzero.monitoring.event;

public class TopicEvent extends DebugEvent
{
  private final String type;
  private final String topic;

  public TopicEvent( String id, String topic )
  {
    this.id = id;
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

  @Override
  public String toString()
  {
    return String.format("{\n"
                         + "  \"id\":\"%s\",\n"
                         + "  \"type\": \"%s\",\n"
                         + "  \"topic\": \"%s\"\n"
                         + "}", id, type, topic);
  }
}
