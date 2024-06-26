package dinamik_statik;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        String[] isimler = {"Seher", "Selim", "Songul", "Saido", "Ali", "sedat"};

        System.out.println(Arrays.toString(isimler)); // [Seher, Selim, Songul, Saido, Ali, sedat]

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler)); // [Ali, Saido, Seher, Selim, Songul, sedat] // Natural Order / Doğal Sıralama

        // Verilen int bir array'deki en küçük ve en büyük sayıları yazdırın

        int[] arr = {5, 9, 1, 0, -3, 2, 5, 9, 1};

        Arrays.sort(arr); // küçükten büyüğe doğru sıralar

        System.out.println("En kucuk sayi : " + arr[0]); // -3
        System.out.println("En buyuk sayi : " + arr[arr.length - 1]); // 9


    }

}
