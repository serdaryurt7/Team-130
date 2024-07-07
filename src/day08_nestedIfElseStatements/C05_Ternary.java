package day08_nestedIfElseStatements;

public class C05_Ternary {
    public static void main(String[] args) {

        // input olarak verilen bir tamsayı için pozitif veya pozitif değil yazdırın

        int input = 56;

        if (input > 0) {
            System.out.println("Sayi pozitif");
        } else {
            System.out.println("Pozitif degil");
        }

        System.out.println(input > 0 ? "Sayi pozitif" : "Pozitif degil");

        // input olarak verilen bir sayı çift sayı ise 2 katına çıkar, tek sayı ise degerini +5 arttır.

        input = input % 2 == 0 ? input * 2 : input + 5;
        System.out.println(input);

        if (input % 2 == 0) {
            input *= 2;
        } else {
            input += 5;
        }
    }
}
