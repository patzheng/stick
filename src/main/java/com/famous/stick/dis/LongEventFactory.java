package com.famous.stick.dis;

import com.lmax.disruptor.EventFactory;

/**
 * @author pat
 * @version V1.0
 * @date 2018/6/15 下午9:25
 */
public class LongEventFactory implements EventFactory<LongEvent> {

    @Override
    public LongEvent newInstance() {
        return new LongEvent();
    }

}
