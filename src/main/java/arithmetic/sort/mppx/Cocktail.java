package arithmetic.sort.mppx;

import common.util.BaseUtil;

/**
 * 冒泡排序的改进—鸡尾酒排序
 * arrLength is:1000000   r1 = 1256054
 * arrLength is:100000   r1 = 12703
 * arrLength is:10000   r1 = 129
 */
public class Cocktail {

    public static void main(String[] args) {

        int a[] = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
        new Cocktail().cocktailSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public void cocktailSort(int arr[]) {

        int arrLength = arr.length;
        int left = 0;
        int right = arrLength - 1;
        while (left < right) {

            for (int i=left; i<right; i++) {
                if (arr[i] > arr[i + 1]) {
                    BaseUtil.swap(arr, i, i + 1);
                }
            }
            right--;
            for (int i=right; i>left; i--) {
                if (arr[i - 1] > arr[i]) {
                    BaseUtil.swap(arr, i - 1, i);
                }
            }
            left++;
        }
    }
}
