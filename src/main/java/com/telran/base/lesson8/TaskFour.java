package com.telran.base.lesson8;

import java.util.Random;

public class TaskFour {

    public static void main(String[] args) {
        Random random = new Random();
        String[] str = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.println(str[random.nextInt(0, str.length)]);

        for (int j = 0; j < 100; j++) {
            int d = random.nextInt(0, str.length);
            System.out.println(str[d]);
        }

    }
}
