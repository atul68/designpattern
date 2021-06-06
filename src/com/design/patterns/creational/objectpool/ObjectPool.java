package com.design.patterns.creational.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends  Poolable> {

    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedBlockingQueue<>();
        for(int i =0; i<count; i++) {
            availablePool.offer(creator.get());
        }
    }

    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException ex) {
            System.err.println("take() was interruptedException");
        }
        return  null;
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException ex) {
            System.err.println("put() was interruptedException");
        }
    }
}
