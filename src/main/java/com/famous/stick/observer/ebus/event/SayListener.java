package com.famous.stick.observer.ebus.event;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;

public class SayListener {

    @Subscribe
    @AllowConcurrentEvents
    public void listener(SayEvent sayEvent) {
        try {
            System.out.println(sayEvent.getWord());
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Subscribe
    @AllowConcurrentEvents
    public void Ajax(SayEvent sayEvent) {
        try {
            Thread.sleep(1000);
            System.out.println("not AllowConcurrentEvents" + sayEvent.getWord());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
