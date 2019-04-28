package thread;

/**
 * @author Administrator
 */
public class Business {

    private boolean subRunningFlag = true;

    public synchronized void sub(int loop) {
        if (!subRunningFlag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : sub run ===> " + i + ", loop is :" + loop);
        }
        subRunningFlag = false;
        this.notify();
    }

    public synchronized void main(int loop) {
        if (subRunningFlag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " : main run ===> " + i + ", loop is :" + loop);
        }
        subRunningFlag = true;
        this.notify();
    }
}
