package com.org.ita.kata;

public abstract class BaseKata {

    @Override
    public String toString() {
        String[] names = this.getClass().toString().split("\\.");
        return String.format("%s", names[names.length - 2]);
    }
}
