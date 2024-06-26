package day07_ifElseStatements;

import java.util.Scanner;

public class C06_VucutKitleEndeksi {
    public static void main(String[] args) {

        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip, vücut kitle endeksini hesaplayın (kilo*10000 / (boy * boy))
        // vücut kitle endeksi 30'dan büyükse obez, 25-30 arası ise kilolu, 20-25 arası ise normal, 20 den küçükse zayıf yazdırın.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz");
        double kilogram = scanner.nextDouble();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy = scanner.nextInt();

        double VKE = (kilogram * 10000 / (boy * boy));

        System.out.println("Vucut kitle endeksiniz: " + VKE);

        if (VKE > 50 || VKE < 10){
            System.out.println("Degerleri yanlis giriniz");
        }
        else if (VKE>30){
            System.out.println("Obez");
        } else if (VKE>=25) {
            System.out.println("Kilolu");
        }else if (VKE>=20) {
            System.out.println("Normal");
        }else
            System.out.println("Zayif");
        }
    }
