package com.famous.stick.simple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cli {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        Iterator<Integer> iterable=list.iterator();
        while(iterable.hasNext()){
            System.out.println(iterable.next());
        }
    }
}


