package day32_encapsulation;

public class C03_Encapsulation {

    private String strPrivate;
    String strDefault;
    protected String strProtected;
    public String strPublic;

    // başka class'lar satisTutari variable'ına değer atayabilsin, atanan her değer toplamsatıştutarı' na otomatik olarak eklensin
    // ama satıştutarı variable'ının değerini kimse yazdıramasın
    // değer atanabilsin ama atanan değer görülemesin
    private int satisTutari;

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari;
    }

    // toplamsatıştutarı değerini başka class'lar görebilsin ama kimse toplamsatıştutarı variable'ına değer atayamasın
    // değeri görülebilsin ama değer atanamasın
    private int toplamSatisTutari;

    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }


    public static void main(String[] args) {

        /*
            Direk erişim için sadece access modifier yeterli olmaz
            static keyword' e bakmak gerekir.

         */

        C03_Encapsulation obj = new C03_Encapsulation();

        obj.strDefault = "Default variable";
        System.out.println(obj.strDefault); // Default variable

        obj.strPrivate = "private variable";
        System.out.println(obj.strPrivate); // private variable

        // System.out.println(strPrivate);

    }

}
