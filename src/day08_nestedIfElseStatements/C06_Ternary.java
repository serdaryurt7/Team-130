package day08_nestedIfElseStatements;

public class C06_Ternary {
    public static void main(String[] args) {

        /*

        Ternary if-else in alternatifi degildir
        Sadece basit islemlerde if-else'in yerine tercih edilebilir

        ternary bir sonuc üretir, Java tek başına ternary'nin sonucunu ne yapacağini bilemez
        YAZDIRMA yada ATAMA yapmalisiniz

        EGER boolean şart true olduğunda elde edilen sonuç ile
        false olduğunda elde edilen sonuç farklı data türlerine sahipse
        bir variable'a atama yapamazsınız, sadece yazdırabilirsiniz.


         */
        int input = 24;

        // iki basamaklı mı ? iki basamaklı ise sayıyı 2 ile çarp, değilse "iki basamakli degil" yazdırın

        System.out.println(input >= 10 && input <= 99 ? input = input * 2 : "iki basamakli degil");
        System.out.println("Input'un son hali : " + input);
    }
}
