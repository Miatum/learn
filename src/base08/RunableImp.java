package base08;

import java.util.concurrent.CountDownLatch;

/**
 * @Description 多线程创建方法一，实现 Runnable接口，重写run方法
 * @ClassName MultiThreads
 * @Author Miatum
 * @date 2021.04.08 21:35
 */
public class RunableImp implements Runnable {
    private Thread t;
    private String threadName;
    public RunableImp(String name) {
        threadName = name;
        System.out.println("创建线程： " +  threadName );
    }
    @Override
    public void run() {
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("线程: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
    }
    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
