package arithmetic.sort.gbpx;

/**
 * 归并排序
 * MergeSortRecursion-arrLength is:10 000 000   r1 = 1921
 * MergeSortRecursion-arrLength is:1 000 000   r1 = 176
 *
 * MergeSortIteration-arrLength is:10 000 000   r1 = 1756
 * MergeSortIteration-arrLength is:1 000 000   r1 = 159
 */
public class Merge {

    public static void main(String[] args) {

        int t = 1 / 2;
        System.out.println("t = " + t);
        int a[] = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };

        new Merge().mergeSortIteration(a);
        //new Merge().mergeSortRecursion(a, 0, 9);


        System.out.println("============================");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void mergeSortIteration(int arr[]) { //非递归(迭代)实现的归并排序(自底向上)
        int left, middle, right, len = arr.length; //两个子数组arr[left...mid]和arr[mid+1...right]下标索引
        for (int i = 1; i < len; i *= 2) { //每次归并两个子数组的长度。初始值为1，每轮翻倍
            left = 0; //每次轮询都是从第一个元素开始
            while (left + i < len) { //存在后一个子数组（需要归并）
                middle = left + i - 1;
                right = middle + 1 + i - 1 < len ? middle + 1 + i - 1 : len - 1; //后一个子数组长度可能不够每次翻倍的长度，故使用真实数组下标
                //System.out.println("归并的："+"left = " + left + /*" ; middle = " + middle +*/ " ; right = " + right);
                merge(arr, left, middle, right);
                left = right + 1; //每次归并两个子数组后，前一个数组下标向后移动到没有归并的元素下标上
            }
        }
    }

    public void mergeSortRecursion(int arr[], int left, int right){ //递归方式实现归并排序
        if (left == right) { //当数组左右下标相等时，为一个元素时结束递归。即前后数组都是一个元素时（right-left=1）递归开始回溯，进行merge操作
            return;
        }
        int middle = (left + right) / 2;
        mergeSortRecursion(arr, left, middle);
        mergeSortRecursion(arr, middle + 1, right);
        //System.out.println("归并的："+"left = " + left + /*" ; middle = " + middle +*/ " ; right = " + right);
        merge(arr, left, middle, right);
    }


    /*
     * 合并两个已排好序的数组arr[left...mid]和arr[mid+1...right],故left、middle和right都是下标
     */
    private void merge(int arr[], int left, int middle, int right) { //归并算法的核心
        int len = right - left + 1;
        int tempArr[] = new int[len]; //临时辅助空间，空间换时间
        int tempArrIndex = 0;
        int li = left;       //初始化，前数组起始元素下标
        int ri = middle + 1; //初始化，后数组起始元素下标，middle+1原因是保证前后两个数组的长度一致

        while (li <= middle && ri <= right) {
            tempArr[tempArrIndex++] = arr[li] <= arr[ri] ? arr[li++] : arr[ri++]; //带等号保证归并排序的稳定性
        }
        while (li <= middle) {
            tempArr[tempArrIndex++] = arr[li++];
        }
        while (ri <= right) {
            tempArr[tempArrIndex++] = arr[ri++];
        }
        for (int i = 0; i < len; i++) {
            arr[left++] = tempArr[i];
        }
    }
}
