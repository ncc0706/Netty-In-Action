package io.arukas.chapert01;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Demo01 {

    public static void main(String[] args) {

        IntStream.range(0, 100000).forEach((i) -> {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName());
                    TimeUnit.MILLISECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        });

    }

}
