package de.uniks.vs.capnzero.monitoring.event;

public class CreateEvent implements DebugEvent
{

  private final int protocol;
  private final String type;

  public CreateEvent( int protocol )
  {
    this.type = "create";
    this.protocol = protocol;
  }

  public int getProtocol()
  {
    return protocol;
  }
}
