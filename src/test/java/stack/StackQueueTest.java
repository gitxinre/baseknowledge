package stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mfl
 * @date 2019/1/15 10:50
 */
public class StackQueueTest {

    @Test
    public void test() {
        StackQueue sq = new StackQueue();
        sq.push("01");
        sq.push("02");
        sq.push("03");


        String pop1 = (String) sq.pop();
        System.out.println("pop1 = " + pop1);

        sq.push("04");
        String pop2 = (String) sq.pop();
        System.out.println("pop2 = " + pop2);
        String pop3 = (String) sq.pop();
        sq.push("05");
        System.out.println("pop3 = " + pop3);
        String pop4 = (String) sq.pop();
        sq.push("06");
        System.out.println("pop4 = " + pop4);
        String pop5 = (String) sq.pop();
        System.out.println("pop5 = " + pop5);
    }

}