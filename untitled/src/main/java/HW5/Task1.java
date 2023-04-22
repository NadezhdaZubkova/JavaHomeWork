package HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class Task1 {

    public static void main(String[] args) {
        Map<String, ArrayList<String>> bookPhone = new HashMap<>();
        addNumber("Сидоров", "11111", bookPhone);
        addNumber("Иванов", "55555", bookPhone);
        addNumber("Петров", "22222", bookPhone);
        addNumber("Сидоров", "234234", bookPhone);
        addNumber("Иванов", "76767767", bookPhone);
        addNumber("Иванов", "77777777", bookPhone);
        printBook(bookPhone);
    }

    public static void addNumber(String key, String value, Map<String, ArrayList<String>>map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void printBook(Map<String, ArrayList<String>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(String el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}