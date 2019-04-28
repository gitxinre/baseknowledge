package thread;

import org.junit.Test;

public class TicketRunnableImplTest {

    public void test01() {
        System.out.println("Start");
        TicketRunnableImpl ticketRunnable = new TicketRunnableImpl(Thread.currentThread().getName());
        Thread t1 = new Thread(ticketRunnable);
        Thread t2 = new Thread(ticketRunnable);
        Thread t3 = new Thread(ticketRunnable);
        Thread t4 = new Thread(ticketRunnable);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("End  !");
    }

    public static void main(String[] args) {
        TicketRunnableImplTest ticketRunnableImplTest = new TicketRunnableImplTest();
        ticketRunnableImplTest.test01();
    }


}
