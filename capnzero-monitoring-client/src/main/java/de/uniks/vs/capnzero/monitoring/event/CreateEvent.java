package de.uniks.vs.capnzero.monitoring.event;

import de.unikassel.vs.pdDebug.Protocol;

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

  @Override
  public String toString()
  {
    return String.format("{\"type\": \"%s\", \"protocol\": \"%s\"}", type, "" + protocol);
  }
}
