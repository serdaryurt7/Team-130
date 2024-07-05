package day42_ListIterators_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

    public static void main(String[] args) {
        // double ended queue demektir (iki taraflı kuyruk)
        // yani eklemeler ve silmeler, baştan veya sondan olabilir
        // baş veya son tercihi size kalmış
        // hemen hemen her method'un first ve last tercih eden halleri vardır

        Deque<Integer> deque = new LinkedList<>();
        deque.add(5);
        deque.add(7);
        deque.add(3);

        System.out.println(deque); // [5, 7, 3]

        deque.addFirst(10);
        deque.addLast(11);

        System.out.println(deque); // [10, 5, 7, 3, 11]

        deque.offerFirst(6);
        deque.offerLast(4);

        System.out.println(deque); // [6, 10, 5, 7, 3, 11, 4]

        deque.removeLastOccurrence(5);
        // List'de bir sayi yazdığımızda onu index olarak kabul ediyordu
        // ama queue veya deque' de aradan index ile eleman silme olmadığından
        // biz bir sayı yazdığımızda o sayıyı silinecek sayı olarak kabul eder

        System.out.println(deque); // [6, 10, 7, 3, 11, 4]

    }

}
