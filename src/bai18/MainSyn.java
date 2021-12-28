package bai18;

public class MainSyn {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();

        Thread2 thread2 = new Thread2();
        Thread thread = new Thread(thread2);

        thread1.start();
        thread.start();
    }

    static synchronized public void testSyn() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Thread1 extends Thread {
        @Override
        public void run() {
            testSyn();
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            testSyn();
        }
    }
 }
