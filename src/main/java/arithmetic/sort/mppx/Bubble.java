package arithmetic.sort.mppx;

import common.util.BaseUtil;

/**
 * 冒泡排序
 * arrLength is:1000000   r1 = 1718738
 * arrLength is:100000   r1 = 17214
 * arrLength is:10000   r1 = 143
 */
public class Bubble {
    public static void main(String[] args) {

        int a[] = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
        new Bubble().bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public void bubbleSort(int arr[]) {
        int arrLength = arr.length;
        for (int i=0; i<arrLength-1; i++) {
            for (int j=0; j<arrLength-1-i; j++) {
                if (arr[j] < arr[j + 1]) {
                    BaseUtil.swap(arr, j, j + 1);
                }
            }
        }
    }
}
