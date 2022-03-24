package QuickSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i <numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));

        quickSort(numbers);

        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }
    private static void quickSort(int[] arr, int left, int right) {
        // return if array is less than 1 length
        if (left >= right) return;
        // Select Pivot Randomly to avoid O(n^2) on almost sorted sets
        int pivotIndex = new Random().nextInt(right - left) + left;
        int pivot = arr[pivotIndex];
        // Put pivot at the end
        swap(arr, pivotIndex, right);
        int lp = left, rp = right-1;
        while (lp < rp) {
            while (lp < rp && arr[lp] <= pivot) lp++;
            while (lp < rp && arr[rp] > pivot) rp--;
            if (lp < rp) swap(arr, lp, rp);
        }
        if (arr[rp] > arr[right]) {
            swap(arr, rp, right);
        }
        else {
            rp = right;
        }
        quickSort(arr, left, rp-1);
        quickSort(arr, rp +1, right);



    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
