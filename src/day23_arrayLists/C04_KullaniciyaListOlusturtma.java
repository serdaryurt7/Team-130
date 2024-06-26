package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListOlusturtma {

    public static void main(String[] args) {

        // Soru 2- Kullanıcıdan istediği kadar isim alıp, Q'ya bastığında girdiği isimleri
        // bize liste olarak döndürecek bir method oluşturun


        System.out.println(listeOlustur());

    }

    public static List<String> listeOlustur() {

        Scanner scanner = new Scanner(System.in);
        List<String> girilenIsimlerinListesi = new ArrayList<>();
        String girilenIsim = "";

        while (!girilenIsim.toUpperCase().equals("Q")) {

            System.out.println("Lutfen listeye eklenecek isim girin \n bitirmek icin Q'ya basin");

            girilenIsim = scanner.nextLine(); // kullanıcının ne giriş yaptığını bilmediğimiz için, listeye eklemeden bir kere daha kontrol edelim

            if (!girilenIsim.toUpperCase().equals("Q")) {
                girilenIsimlerinListesi.add(girilenIsim);

            }


        }

        return girilenIsimlerinListesi;
    }
}
