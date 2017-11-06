package com.famous.stick.observer.ebus.event;

import com.google.common.eventbus.EventBus;

public class App {
    public static void main(String[] args) {
        final EventBus eventBus = new EventBus();
        eventBus.register(new SayListener());
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    eventBus.post(new SayEvent("22"));
                }
            }).start();
        }
    }
}
