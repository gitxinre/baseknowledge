package thread;

/**
 * @author Administrator
 */
public class TicketRunnableImpl implements Runnable {

    private String name;
    private int ticketNums = 3000;

    TicketRunnableImpl(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (ticketNums > 0) {
            synchronized (this.name) {
                if (ticketNums <= 0) {
                    System.out.println("name = " + Thread.currentThread().getName() + " ===> ticketNums is " + ticketNums);
                    return;
                }
                ticketNums--;
                System.out.print(Thread.currentThread().getName() + " --- traditional thread run ... " + ticketNums);
                System.out.println();
            }
        }
    }
}
