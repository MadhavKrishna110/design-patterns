package org.example.behavioural.observer;

public interface Subscriber<T> {
    void listen(Events events,T detail);
}
