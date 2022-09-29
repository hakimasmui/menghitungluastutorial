package com.kaspin.menghitungluastutorial;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class LiveDataUtil {
    public static <T> T getOrAwaitValue(final LiveData liveData) throws InterruptedException {
        Object[] data = new Object[1];
        CountDownLatch latch = new CountDownLatch(1);

        Observer observer = new Observer() {
            @Override
            public void onChanged(Object o) {
                data[0] = o;
                latch.countDown();
                liveData.removeObserver(this);
            }
        };
        liveData.observeForever(observer);

        if (!latch.await(2, TimeUnit.SECONDS)) {
            throw new RuntimeException("LiveData belum di set");
        }

        return (T) data[0];
    }
}
