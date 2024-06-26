package day15_methodOlusturma;

import java.util.Scanner;

public class C01_KendiSubstringMethodumuz {
    public static void main(String[] args) {
         /*
            Verilen bir string ve başlangıç ve bitiş index'leri için aşağıdaki görevi tamamlayın
            1- Başlangıç index'i bitiş index'inden büyükse hata yazdırın
            2- Başlangıç ve/veya bitiş index'i verilen string dışında ise hata yazdırın
            3- index'ler sınırlar içerisinde ise, başlangıç index'i dahil, bitiş index'i hariç olacak şekilde
            iki index arasındaki harfleri yazdırın
          */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Lutfen baslangic index'ini giriniz");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis index'ini giriniz");
        int bitis = scanner.nextInt();

        if (baslangic > bitis) {
            System.out.println("Baslangic index'i bitis index'inden kucuk olmalidir");
        } else if (baslangic >= metin.length() || bitis >= metin.length()) {
            System.out.println("Verilen index'ler metnin disinda");
        }else{
            for (int i = baslangic; i < bitis ; i++) {
                System.out.print(metin.charAt(i));
            }
        }

        System.out.println("");
        System.out.println(metin.substring(baslangic, bitis));
    }
}
