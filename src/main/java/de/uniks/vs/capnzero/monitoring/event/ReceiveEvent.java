package de.uniks.vs.capnzero.monitoring.event;

public class ReceiveEvent implements DebugEvent
{
  private final String type;
  private final String message;

  public ReceiveEvent(String message)
  {
    this.type = "receive";
    this.message = message;
  }

  public String getType()
  {
    return type;
  }

  public String getMessage()
  {
    return message;
  }
}
