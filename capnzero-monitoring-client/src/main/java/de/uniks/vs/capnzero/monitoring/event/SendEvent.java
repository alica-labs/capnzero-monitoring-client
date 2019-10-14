package de.uniks.vs.capnzero.monitoring.event;

 public class SendEvent implements DebugEvent
{
  private final String topic;
  private final String type;
  private final String message;

  public SendEvent( String message, String topic)
  {
    this.type = "send";
    this.message = message;
    this.topic = topic;
  }

  public String getTopic()
  {
    return topic;
  }

  public String getType()
  {
    return type;
  }

  public String getMessage()
  {
    return message;
  }

  @Override
  public String toString()
  {
    return String.format("{\"type\": \"%s\", \"topic\": \"%s\", \"message\": \"%s\"}", type, topic, message);
  }
}
