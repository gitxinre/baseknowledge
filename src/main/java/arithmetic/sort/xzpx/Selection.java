package arithmetic.sort.xzpx;

import common.util.BaseUtil;

/**
 * 选择排序
 * arrLength is:1000000   r1 = 427671
 * arrLength is:100000   r1 = 4456
 * arrLength is:10000   r1 = 44
 */
public class Selection {

    public static void main(String[] args) {
        int a[] = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
        new Selection().selectionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void selectionSort(int arr[]) {
        int arrLength = arr.length;
        for (int i=0; i<arrLength-1; i++) {
            int min = i;
            for (int j=i+1; j<arrLength; j++) {
                if (arr[min] < arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                BaseUtil.swap(arr, min, i);
            }
        }
    }


}
