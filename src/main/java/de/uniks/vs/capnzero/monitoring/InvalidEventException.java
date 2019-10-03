package de.uniks.vs.capnzero.monitoring;

public class InvalidEventException extends RuntimeException
{
  public InvalidEventException( String message )
  {
    super(message);
  }
}
