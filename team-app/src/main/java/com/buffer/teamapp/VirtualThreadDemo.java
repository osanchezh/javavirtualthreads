package com.buffer.teamapp;
import java.util.stream.IntStream;

public class VirtualThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        //Thread.ofPlatform()
        //        .start(()->System.out.println("Platform Thread : "+Thread.currentThread()));
        //System.out.println("------------------------------");

        //Thread.ofVirtual()
        //        .start(()->System.out.println("Virtual Thread : "+Thread.currentThread()));
//    }
/*
        var start = System.currentTimeMillis();
        var totalThread = 10000;
        var threads = IntStream.range(0, totalThread)
                .mapToObj(
                        thCount -> Thread.ofVirtual().unstarted(() -> {
                        })).toList();
        threads.forEach(Thread::start);
        for (Thread thread : threads) {
            thread.join();
        }
        var end = System.currentTimeMillis();
        System.out.println("millis used to launch " + totalThread + "vthreads:" + (end - start) + "ms");
*/
    }
}