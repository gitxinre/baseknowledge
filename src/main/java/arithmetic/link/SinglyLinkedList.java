package arithmetic.link;

import java.util.LinkedList;

public class SinglyLinkedList {

    public String getIntersection(LinkedList<String> list1, LinkedList<String> list2) {

        if (list1 == null || list2 == null) {
            return null;
        }
        LinkedList<String> l1 = list1;
        LinkedList<String> l2 = list2;
        while (l1 != l2) {
            list1.add("");
        }

        return null;
    }
}
