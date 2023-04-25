package HW4;

import java.util.Collections;
import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        Collections.addAll(ll, "one", "two", "three", "four", "five");
        System.out.println(ll);
        ll=reverseLinkedList(ll);
        System.out.println(ll);
    }

    private static LinkedList<String> reverseLinkedList(LinkedList<String> ll) {
        for (int i=0; i<ll.size()/2; i++){
            String tmp = ll.get(i);
            ll.set(i,ll.get(ll.size()-i-1));
            ll.set(ll.size()-i-1,tmp);
        }
        return ll;
    }
}
