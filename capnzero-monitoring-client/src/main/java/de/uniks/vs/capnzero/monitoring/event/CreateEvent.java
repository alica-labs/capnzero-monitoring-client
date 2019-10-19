package de.uniks.vs.capnzero.monitoring.event;

public class CreateEvent extends DebugEvent
{
  private String protocol;

  public CreateEvent( String id, String protocol )
  {
    this.id = id;
    this.type = "create";
    this.protocol = protocol;
  }

  public String getProtocol()
  {
    return protocol;
  }

  @Override
  public String toString()
  {
    return String.format("{\"id\":\"%s\", \"type\": \"%s\", \"protocol\": \"%s\"}", id, type, protocol);
  }
}