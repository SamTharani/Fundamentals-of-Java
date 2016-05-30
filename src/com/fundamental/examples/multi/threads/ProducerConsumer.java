package com.fundamental.examples.multi.threads;


import java.util.Queue;
import java.util.Vector;

public class ProducerConsumer {

    public static void main(String[] args) {

        Vector sharedQueue = new Vector();
        int size = 5;
        Producer producer = new Producer(sharedQueue, size);
        Consumer consumer = new Consumer(sharedQueue,size);
        producer.start();
        consumer.start();
    }
}
