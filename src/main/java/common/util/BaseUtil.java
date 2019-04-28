package common.util;

public class BaseUtil {

    /**
     * 交换两个对象的值，值传递
     *
     * @param obj1
     * @param obj2
     */
    public static void swap(Object obj1, Object obj2) {
        Object temp = obj1;
        obj1 = obj2;
        obj2 = temp;
    }

    /**
     * 数组的两个元素值交换，引用传递
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
