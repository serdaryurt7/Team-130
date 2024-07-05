package day42_ListIterators_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

    /*
        Queue (kuyruk) yapısı gereği eklenenler otomatik olarak sona eklenir ve silinenler baştan silinir

     */

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList();

        queue.add(6);
        queue.add(9);
        queue.add(2);

        System.out.println(queue); // [6, 9, 2]

        queue.remove();
        System.out.println(queue); // [9, 2] en baştakini siler

        System.out.println(queue.element()); // 9 en baştaki elementi silmeden bize getirir

        System.out.println(queue); // [9, 2]

        System.out.println(queue.peek()); // 9 en baştaki elementi silmeden bize getirir

        System.out.println(queue); // [9, 2]

        Queue<Integer> bosQueue = new LinkedList<>();

        // bosQueue.element(); // NoSuchElementException

        bosQueue.peek(); // null

        // ikisi aynı işlemi yapar ama aralarındaki fark,
        // boş queue' de element exception fırlatır, peek null döndürür

        queue.offer(7);

        System.out.println(queue); // [9, 2, 7]

        // add ile aynı işlevi yapar
        // aralarındaki fark, add her durumda ekler
        // ama offer kapasite sınırlaması yoksa ekler

        System.out.println(queue.poll()); // 9 queue'nun başındaki elementi siler ve bize getirir

        System.out.println(queue); // [2, 7]

        // bosQueue.remove(); // NoSuchElementException
        System.out.println(bosQueue.poll()); // null

        System.out.println(queue.isEmpty()); // false

    }

}
