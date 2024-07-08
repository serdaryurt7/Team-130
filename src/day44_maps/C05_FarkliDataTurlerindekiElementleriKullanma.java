package day44_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C05_FarkliDataTurlerindekiElementleriKullanma {

    public static void main(String[] args) {

        List<String> things = new ArrayList<>();

        things.add("Gul");

        // things.add(10);
        // things.add(false);
        // things.add('K');

        int[] arr = {4, 5, 6};

        // things.add(arr);

        // ben farklı data türündeki her türlü şeyi bir listeye eklemek istersem

        List<Object> seyler = new ArrayList();

        seyler.add("Sedat");
        seyler.add(10);
        seyler.add(false);
        seyler.add('K');
        seyler.add(arr);

        System.out.println(seyler); // [Sedat, 10, false, K, [I@6d03e736]

        // 1.index'de bulunan sayinin 2 katini yazdırın

        System.out.println((Integer) seyler.get(1) * 2); // 20 Operator '*' cannot be applied to 'java.lang.Object', 'int'

        // 0.index'deki ismi büyük harflerle yazdırın

        System.out.println(((String) seyler.get(0)).toUpperCase()); // SEDAT

        // 4.index'deki Array'i yazdırın

        System.out.println(Arrays.toString((int[]) seyler.get(4))); // [4, 5, 6]


    }
}
