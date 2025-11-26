package com.mercury.study.tdd.cp13;

import java.util.Hashtable;

public class Bank {

    private Hashtable rates = new Hashtable();

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    int rate(String from, String to) {
        if(from.equals(to)) return 1;
        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }
}
