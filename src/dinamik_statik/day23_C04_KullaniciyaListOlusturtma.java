package dinamik_statik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day23_C04_KullaniciyaListOlusturtma {

    public static void main(String[] args) {

        // Soru 2- Kullanıcıdan istediği kadar isim alıp, Q'ya bastığında girdiği isimleri
        // bize liste olarak döndürecek bir method oluşturun


        List<String> liste = listeOlustur();

        System.out.println(liste);
    }

    public static List<String> listeOlustur() {

        Scanner scanner = new Scanner(System.in);

        List<String> girilenIsimlerListesi = new ArrayList<>();

        String girilenIsim = "";

        while (!girilenIsim.toUpperCase().equals("Q")) {

            System.out.println("Lutfen listeye eklenecek isim girin\nbitirmek icin Q' ya basin");

            girilenIsim = scanner.nextLine(); // kullanıcının ne giriş yaptığını bilmediğimiz için, listeye eklemeden bir kere daha kontrol edelim.

            if (!girilenIsim.toUpperCase().equals("Q")) {

                girilenIsimlerListesi.add(girilenIsim);

            }

        }

        return girilenIsimlerListesi;

    }
}
