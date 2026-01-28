package app;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // елемент знайдено
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array;
        array = new int[] {14, 65, 32, 94, 1, 12, 4, 45, 24, 19, 76, 80, 23, 62, 48};
        System.out.println("Початковий масив: " + Arrays.toString(array));

        insertionSort(array);
        System.out.println("Відсортований масив: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число пошуку: ");
        int target = scanner.nextInt();

        int index = binarySearch(array, target);
        if (index !=-1) {
            System.out.println("Число знайдено! Індекс числа: " + target + " у відсортованому масиві: " + index);
        }
        else {
            System.out.println("Число не знайдено у масиві.");
        }
        scanner.close();
    }
}