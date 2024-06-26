package day12_stringManipulation;

public class C05_stringManipulations {
    public static void main(String[] args) {

        // Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // input1 : “15.35 €” , input2 : “11.40 €”
        // output : 26.70 €

        String fiyat1 = "15.35 €";
        String fiyat2 = "11.40 €";

        fiyat1 = fiyat1.replaceAll("\\D", ""); // 1535
        fiyat2 = fiyat2.replaceAll("\\D", ""); // 1140

        Double fyt1 = Double.parseDouble(fiyat1);
        Double fyt2 = Double.parseDouble(fiyat2);

        System.out.println((fyt1 + fyt2) / 100 + " €"); // 26.75 €
    }
}
