package sorts;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};

        for (int step = 0; step< array.length; step++) {
            System.out.println(Arrays.toString(array));
            int index = min(array, step);

            int tmp = array[step];
            array[step] = array[index];
            array[index] = tmp;
        }



    }

    private static int min(int[] array, int start) { // start задается элемента в массиве с которого начинается сортировка
        int minValue = array[start];
        int minIndex = start;

        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;

    }
}

