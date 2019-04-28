package thread;

/**
 * @author Administrator
 */
public class TraditionalThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 180; i++) {
            System.out.println(currentThread().getName() + " traditional thread run ... " + i);
        }
    }

    public static void main(String[] args) {
        TraditionalThread traditionalThread = new TraditionalThread();
        traditionalThread.start();

        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 180; i++) {
                    System.out.println(currentThread().getName() + " traditional thread run ... " + i);
                }
            }
        }).start();

        for (int i = 0; i < 180; i++) {
            System.out.println(currentThread().getName() + " main method ... " + i);
        }
    }
}
