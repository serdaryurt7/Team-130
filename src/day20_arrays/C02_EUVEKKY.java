package day20_arrays;

public class C02_EUVEKKY {
    public static void main(String[] args) {

        // Verilen String bir array'deki en uzun ve en kısa kelimeleri yazıran bir method oluşturun
        // aynı uzunluktaki isimler varsa, herhangi birini yazdırın

        String[] isimler = {"Sedat", "Kenan", "Mustafa", "Gul", "Ramazan", "Eren", "Abdurrahman", "Su"};

        uzunVeKisaIsimYazdir(isimler);


    }

    public static void uzunVeKisaIsimYazdir(String[] isimler) {

        String enUzunIsim = isimler[0];
        String enKisaIsim = isimler[0];

        for (int i = 1; i < isimler.length; i++) {

            if (enUzunIsim.length() < isimler[i].length()) {

                enUzunIsim = isimler[i];

            }

            if (enKisaIsim.length()> isimler[i].length()){

                enKisaIsim = isimler[i];

            }

        }

        System.out.println("En uzun isim : " + enUzunIsim);
        System.out.println("En kisa isim : " + enKisaIsim);


    }

}
