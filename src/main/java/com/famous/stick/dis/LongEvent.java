package com.famous.stick.dis;

/**
 * @author pat
 * @version V1.0
 * @date 2018/6/15 下午9:25
 */
public class LongEvent {

    private Long value;

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LongEvent{" +
                "value=" + value +
                '}';
    }
}
