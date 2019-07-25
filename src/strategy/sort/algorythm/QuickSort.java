package strategy.sort.algorythm;

import java.util.Random;

public class QuickSort implements SortInterface {

    @Override
    public int[] sortMe(int[] array) {

        quicksort(array);

        return array;
    }

    private void quicksort(int[] array) {

        quicksort(array, 0, array.length - 1);
    }

    private void quicksort(int[] array, int first, int last) {
        if (first < last) {
            int pivot = partition(array, first, last);

            quicksort(array, first, pivot - 1);
            quicksort(array, pivot + 1, last);
        }
    }

    private int partition(int[] input, int first, int last) {

        int pivot = first + new Random().nextInt(last - first + 1);

        swap(input, pivot, last);
        for (int i = first; i < last; i++) {
            if (input[i] <= input[last]) {
                swap(input, i, first);
                first++;
            }
        }

        swap(input, first, last);
        return first;
    }

    private void swap(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }
}
