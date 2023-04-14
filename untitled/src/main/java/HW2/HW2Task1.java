package HW2;

import java.util.Scanner;

//Напишите метод, который принимает на вход строку (String) и определяет является ли
// строка палиндромом (возвращает boolean значение).
public class HW2Task1 {
    public static void main(String[] args){
        Scanner skanner = new Scanner(System.in);
        String string = skanner.next();
        System.out.println(isPalindrom(string));
        skanner.close();
    }

    private static boolean isPalindrom(String string) {
        return string.equalsIgnoreCase((new StringBuilder(string)).reverse().toString());
    }
}
