package com.famous.stick;

/**
 * @author pat
 * @version V1.0
 * @date 2018/4/28 下午2:33
 */
public class App {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("Lkk");
    }
}
