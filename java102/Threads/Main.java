package Threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        addNumbers(list);

        List<Integer> list1 = list.subList(0, 2500);
        List<Integer> list2 = list.subList(2500, 5000);
        List<Integer> list3 = list.subList(5000, 7500);
        List<Integer> list4 = list.subList(7500, 10000);

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                operate(list1, odds, evens);
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                operate(list2, odds, evens);
            }
        };
        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                operate(list3, odds, evens);
            }
        };
        Runnable r4 = new Runnable() {
            @Override
            public void run() {
                operate(list4, odds, evens);
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        Thread t4 = new Thread(r4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }

    public static void addNumbers(List<Integer> list) {
        for (int i = 1; i < 10001; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
    }

    public static void operate(List<Integer> list, List<Integer> odds, List<Integer> evens) {
        for (int i : list) {
            if (i % 2 == 0) {
                evens.add(i);
                System.out.println(Thread.currentThread().getName() + " " + i + " to evens.");
            } else {
                odds.add(i);
                System.out.println(Thread.currentThread().getName() + " " + i + " to oddds.");
            }
        }
    }
}
