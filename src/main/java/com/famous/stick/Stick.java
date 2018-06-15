package com.famous.stick;

import java.io.Serializable;

/**
 * @author pat
 * @version V1.0
 * @date 2018/5/24 上午9:59
 */
public class Stick implements Serializable {

    private int a = 0;
    public final static String name = "zhangsan";

    public int add(int a, int b) {
        return a + b;
    }

}
