package day11_stringManipulation;

public class C04_isEmpty_isBlank {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "     ";
        String str3 = "a b";

        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false
        System.out.println(str3.isEmpty()); // false

        System.out.println(str1.isBlank()); // true
        System.out.println(str2.isBlank()); // true
        System.out.println(str3.isBlank()); // true

        // isEmpty hiçliğe true dönüyor

        // isBlank hiçliğe de true dönüyor ve sadece space'lerden oluşmuş String'lere de true dönüyor
    }
}
