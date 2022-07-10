package com.org.ita.menu;

import com.org.ita.utils.Runner;

public class Exit implements Runner {
    @Override
    public void run() {
        System.exit(0);
    }
}
