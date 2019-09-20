package de.uniks.vs.capnzero.monitoring.proxy;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import de.uniks.vs.capnzero.monitoring.event.CreateEvent;
import de.uniks.vs.capnzero.monitoring.event.Event;

public class DummyEventProxy implements EventProxy {

  Queue<Event> eventQueue;

  public DummyEventProxy() {
    this.eventQueue = new LinkedBlockingQueue<>();
    eventQueue.add(new CreateEvent());
    eventQueue.add(new CreateEvent());
    eventQueue.add(new CreateEvent());
    eventQueue.add(new CreateEvent());
    eventQueue.add(new CreateEvent());
  }

  @Override
  public void startListening() {
    System.out.println("Start listening on dummy");
  }

  @Override
  public void stopListening() {
    System.out.println("Stop listening on dummy");

  }

  @Override
  public boolean hasEvent() {
    return !eventQueue.isEmpty();
  }

  @Override
  public Event nextEvent() {
    return eventQueue.poll();
  }
}
