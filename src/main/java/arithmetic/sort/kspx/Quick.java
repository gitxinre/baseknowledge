package arithmetic.sort.kspx;

import common.util.BaseUtil;

public class Quick {
    public static void main(String[] args) {

        int a[] = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
        new Quick().QuickSort(a,0,a.length-1);

        System.out.println("============================");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public void quickSort() {

    }

    private int Partition(int A[], int left, int right) {// 划分函数
        int pivot = A[right];               // 这里每次都选择最后一个元素作为基准
        int tail = left - 1;                // tail为小于基准的子数组最后一个元素的索引
        for (int i = left; i < right; i++) { // 遍历基准以外的其他元素
            if (A[i] <= pivot) {            // 把小于等于基准的元素放到前一个子数组末尾
                BaseUtil.swap(A, ++tail, i);
            }
        }
        BaseUtil.swap(A, tail + 1, right);           // 最后把基准放到前一个子数组的后边，剩下的子数组既是大于基准的子数组
        // 该操作很有可能把后面元素的稳定性打乱，所以快速排序是不稳定的排序算法
        return tail + 1;                    // 返回基准的索引
    }

    public void QuickSort(int A[], int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot_index = Partition(A, left, right); // 基准的索引
        System.out.println("left = " + left + "  ;  right = " + right + "  ;  pivot_index = " + pivot_index);
        QuickSort(A, left, pivot_index - 1);
        QuickSort(A, pivot_index + 1, right);
    }
}
