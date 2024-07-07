package day12_stringManipulations;

public class C02_ReplaceAll {
    public static void main(String[] args) {
        String str = "J1a34va12 C87an90d654ir";

        // metinden tüm sayıları temizleyip, metni kaydedin.

        // ReplaceAll tek tek harfleri, rakamları değil -- Tüm harfler yada tüm rakamları diyebileceğimiz durumlarda kullanılır.

        // örneğin bu soruda "tum sayilari yok etmemiz" lazım

        str = str.replaceAll("\\d", "");
        System.out.println(str);
    }
}
