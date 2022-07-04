package com.org.ita;

import com.org.ita.utils.Tasks;

public class EightList implements Runner{
    @Override
    public void run() {

        for (int i = 0; i < 9; i++) {
            System.out.println(i+")"+Tasks.getTaskById(i));
        }
        int num = scanner.nextInt();
        switch (num){
            case 1:
        }
    }
}
