package de.uniks.vs.capnzero.monitoring.event;

public class SubscribeEvent implements DebugEvent
{
  private final String type;

  public SubscribeEvent()
  {
    this.type = "subscribe";
  }

  public String getType()
  {
    return type;
  }

  @Override
  public String toString()
  {
    return String.format("{ \"type\": \"%s\" }", type);
  }
}
