package HW3;

import java.util.ArrayList;
import java.util.Iterator;

//Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("3");
        list.add("lj");
        list.add("1");
        list.add("ll");
        list.add("-5");
        list.add("f");
        System.out.printf("Исходный список %s\n", list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().matches("-?\\d+(\\.\\d+)?$")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}