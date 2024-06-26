package dinamik_statik;

import java.util.ArrayList;
import java.util.List;

public class day22_C04_ArrayList {

    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>();

        // List<Integer> abc = new List<>();   List interface olduğundan direk obje oluşturulmaz

        ArrayList<Integer> abc = new ArrayList<>(); // bu yazım çok kullanılmaz

        // List'e element eklemek için

        sayilar.add(7);
        sayilar.add(2);
        sayilar.add(9);

        System.out.println(sayilar); // [7, 2, 9]

        // 7 ile 2 arasına element olarak 5 ekleyin

        sayilar.add(1, 5);

        System.out.println(sayilar); // [7, 5, 2, 9]

        // sayilar listesinde eleman olarak 3 var mı ?

        System.out.println(sayilar.contains(3)); // false

        System.out.println(sayilar.contains(5)); // true
    }

}
