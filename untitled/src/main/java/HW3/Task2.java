package HW3;

import java.util.ArrayList;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
public class Task2 {
    public static void main(String[] args){
        ArrayList<Integer> arrList= randomArr(10);
        System.out.printf("Исходный список %s\n" , arrList);

        int min = arrList.get(0);
        int max = arrList.get(0);
        float sum = 0;
        for (int i = 0; i < arrList.size(); i++) {
            int num = arrList.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }
        float average = sum / arrList.size();

        System.out.println("Минимальное значение: " + min);

        System.out.println("Максимальное значение: " + max);

        System.out.println("Среднее арифметическое значение: " + average);
    }

    private static ArrayList<Integer> randomArr(int size) {
        Random rnd = new Random();
        ArrayList<Integer>lst = new ArrayList<Integer>();
        for ( int i =0; i<size; i++) {
            int val = rnd.nextInt(-50,50);
            lst.add(val);
        }
        return lst;
    }
}
