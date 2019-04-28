package thread;

public class T1T2T3Test {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("thread 1 running ……");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println("thread 1 stoped ……");
                }
                super.run();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                System.out.println("thread 2 running ……");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println("thread 2 stoped ……");
                }
                super.run();
            }
        };
        Thread t3 = new Thread(){
            @Override
            public void run() {
                System.out.println("thread 3 running ……");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println("thread 3 stoped ……");
                }
                super.run();
            }
        };


        try {
            System.out.println("main 1");
            t1.start();
            //t1.join();
            System.out.println("main 3");
            t3.start();
            t3.join();
            System.out.println("main 2");
            t2.start();
            //t2.join();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
