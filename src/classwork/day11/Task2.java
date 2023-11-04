package classwork.day11;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();

        new Thread(() -> {
            synchronized (obj) {
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("t1-%s  ", i);
                }
            }
        }).start();


        synchronized (obj) {
            for (int i = 0; i < 3; i++) {
                Thread.currentThread().
                        sleep(1000);
                System.out.printf("m-%s  ", i);
            }
        }
    }
}
