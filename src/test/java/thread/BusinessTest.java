package thread;

import static org.junit.Assert.*;

public class BusinessTest {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        final Business business = new Business();
        final int loop = 5;

        new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= loop; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    business.sub(i);
                }
            }
        }).start();

        for (int i = 1; i <= loop; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            business.main(i);
        }

        long end = System.currentTimeMillis();
        long r = end - start;
        System.out.println("r = " + r);
    }

}