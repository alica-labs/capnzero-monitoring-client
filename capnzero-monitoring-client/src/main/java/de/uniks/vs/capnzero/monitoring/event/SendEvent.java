package de.uniks.vs.capnzero.monitoring.event;

 public class SendEvent extends DebugEvent
{
  private final String topic;
  private final String message;

  public SendEvent( String id, String message, String topic)
  {
    this.id = id;
    this.type = "send";
    this.message = message;
    this.topic = topic;
  }

  public String getTopic()
  {
    return topic;
  }

  public String getMessage()
  {
    return message;
  }

  @Override
  public String toString()
  {
    return String.format("{\"id\":\"%s\", \"type\": \"%s\", \"topic\": \"%s\", \"message\": \"%s\"}", id, type, topic,
      message);
  }
}
