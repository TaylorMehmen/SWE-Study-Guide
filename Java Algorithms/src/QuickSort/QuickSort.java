package QuickSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100];

        for (int i = 0; i < 100; i++) {
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
    private static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) return;
        //choose pivot
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, highIndex);
        int lp = partition(arr, lowIndex, highIndex, pivot);
        quickSort(arr, lowIndex, lp -1);
        quickSort(arr, lp + 1, highIndex);
    }

    private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
        int lp = lowIndex;
        int rp = highIndex;
        while (lp < rp){
            while(arr[lp] <= pivot && lp < rp) {
                lp ++;
            }
            while (arr[rp] >= pivot && lp < rp) {
                rp--;
            }
            swap(arr, lp, rp);
        }
        if (arr[lp] > arr[highIndex]) {
            swap(arr, lp, highIndex);
        }
        else {
            lp = highIndex;
        }
        return lp;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
