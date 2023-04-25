package HW4;

import java.util.Scanner;
import java.util.Stack;

//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while (true) {
            System.out.println();
            System.out.print("Введите строку: ");
            String inputString = in.nextLine();

            if (inputString.trim().length() == 0) {

                System.out.println("Строка не должна быть пустой");
                continue;
            }
            if (inputString.equalsIgnoreCase("q")) {
                break;
            }

            else if  (inputString.equals("revert")) {
                    stack.pop();
                }
            else if (inputString.equals("print")) {
                for (int i=stack.size()-1; i>=0; i--) {
                    System.out.println(stack.elementAt(i));
                }
            }
            else {
                    stack.push(inputString);
                }

        }
    }
}
