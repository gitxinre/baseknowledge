package arithmetic.sort;

import arithmetic.sort.crpx.Insertion;
import arithmetic.sort.gbpx.Merge;
import arithmetic.sort.kspx.Quick;
import arithmetic.sort.mppx.Bubble;
import arithmetic.sort.mppx.Cocktail;
import arithmetic.sort.xzpx.Selection;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Random;

public class TestDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10000000];
        for (int i=0; i<10000000; i++) {
            int randomInt = random.nextInt(100000000);
            //System.out.println("randomInt = " + randomInt);
            arr[i] = randomInt;
        }

        String abcd = null;
        if (abcd == null || StringUtils.isEmpty(abcd.trim())) {
            System.out.println("abcd = " + abcd);
        }
        boolean notEmpty = StringUtils.isNotEmpty(abcd.trim());
        System.out.println("notEmpty = " + notEmpty);

        StringUtils.isEmpty("");

        int a[] = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
        long s1 = System.currentTimeMillis();
        //new Bubble().bubbleSort(arr);
        //new Cocktail().cocktailSort(arr);
        //new Selection().selectionSort(arr);
        //new Insertion().insertionSort(arr);
        //new Merge().mergeSortRecursion(arr, 0, arr.length-1);
        //new Merge().mergeSortIteration(arr);
        //new Quick().QuickSort(arr, 0, arr.length - 1);
        //Arrays.sort(arr);
        long e1 = System.currentTimeMillis();
        System.out.println("arrLength is:" + arr.length + "   r1 = " + (e1 - s1));
        int i1 = arr.length / a.length;
        for (int i = 0; i < a.length; i++) {
            System.out.println(arr[i * i1]);
        }
    }
}
