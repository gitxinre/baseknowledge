package arithmetic.sort.crpx;

/**
 * 插入排序
 * arrLength is:1 000 000   r1 = 221925
 * arrLength is:100000   r1 = 2237
 * arrLength is:10000   r1 = 23
 */
public class Insertion {

    public static void main(String[] args) {


        int a[] = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
        new Insertion().insertionSort(a);
        System.out.println("arrLength is:"+a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void insertionSort(int arr[]) {

        int arrLength = arr.length;
        for (int i = 1; i < arrLength; i++) {       // 类似抓扑克牌排序
            int temp = arr[i];                 // 右手抓到一张扑克牌
            int j = i - 1;                  // 拿在左手上的牌总是排序好的
            while (j >= 0 && arr[j] > temp) {    // 将抓到的牌与手牌从右向左进行比较
                arr[j + 1] = arr[j];            // 如果该手牌比抓到的牌大，就将其右移
                j--;
            }
            arr[j + 1] = temp; // 直到该手牌比抓到的牌小(或二者相等)，将抓到的牌插入到该手牌右边(相等元素的相对次序未变，所以插入排序是稳定的)
        }
    }
}
