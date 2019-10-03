package de.uniks.vs.capnzero.monitoring.event;

public class CreateEvent implements DebugEvent
{

  private final String protocol;
  private final String type;

  public CreateEvent( String protocol )
  {
    this.type = "create";
    this.protocol = protocol;
  }

  public String getProtocol()
  {
    return protocol;
  }
}
