package HW3;

import java.util.ArrayList;
import java.util.Random;

//Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
public class Task1 {
    public static void main(String[] args){
        ArrayList<Integer> list1= randomArr(10);
        System.out.printf("Исходный список %s\n" , list1);
        list1.removeIf(n -> (n % 2 == 0));
        System.out.printf("Изменённый список %s\n" , list1);

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
