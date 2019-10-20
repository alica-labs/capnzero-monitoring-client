package de.uniks.vs.capnzero.monitoring.event;

 public class SendEvent extends DebugEvent
{
  private final String message;

  public SendEvent( String id, String message)
  {
    this.id = id;
    this.type = "send";
    this.message = message;
  }

  public String getMessage()
  {
    return message;
  }

  @Override
  public String toString()
  {
    return String.format("{\n"
                         + "  \"id\":\"%s\",\n"
                         + "  \"type\": \"%s\",\n"
                         + "  \"message\": \"%s\"\n"
                         + "}", id, type, message);
  }
}
