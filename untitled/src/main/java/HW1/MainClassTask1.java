package HW1;

import java.util.Arrays;
import java.util.Random;

public class MainClassTask1 {
// Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void main(String[] args) {
        int [] arr = getRandomArr(5);
        System.out.println(Arrays.toString(arr));
       int  minElement = getMinMeaning(arr);
       int  maxElement = getMaxMeaning(arr);
        System.out.printf("Минимальный элемент равен %d, максимальный элемент равен %d",minElement,maxElement);

    }

    private static int getMinMeaning(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    private static int getMaxMeaning(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    private static int[] getRandomArr(int size) {

        int[] arr = new int[size];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-10,10);
        }
        return arr;
    }
}
