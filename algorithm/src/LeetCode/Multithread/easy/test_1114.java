package LeetCode.Multithread.easy;

import java.util.concurrent.CountDownLatch;

public class test_1114 {

    /*boolean f = false;
    boolean s = false;
    boolean t = false;*/

    CountDownLatch latch_2 = new CountDownLatch(1);
    CountDownLatch latch_3 = new CountDownLatch(1);

    public test_1114() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        latch_2.countDown();
        //this.notifyAll();

    }

    public void second(Runnable printSecond) throws InterruptedException {
        latch_2.await();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        latch_3.countDown();



    }

    public void third(Runnable printThird) throws InterruptedException {
        latch_3.await();

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();



    }
}
