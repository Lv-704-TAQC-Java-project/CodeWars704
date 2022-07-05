package com.org.ita.utils;

public class Exit implements Runner {
    @Override
    public void run() {
        System.exit(0);
    }
}
