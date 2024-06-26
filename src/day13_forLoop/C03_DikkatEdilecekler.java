package day13_forLoop;

public class C03_DikkatEdilecekler {

    public static void main(String[] args) {

        // Eger i'nin ilk değeri için bile bitiş şartı true olmazsa
        // loop body'si hiç devreye girmez
        // LOOP çalışır ama HİÇ BİR İŞLEM YAPMAZ

        for (int i = 0; i > 20; i++) {
            System.out.println("Bu loop body'si hiç çalışmaz");
        }

        // EĞER i' nin bütün değerleri için bitiş şartı TRUE oluyorsa
        // bu duruma teknik olarak SONSUZ LOOP denir

        for (int i = 10; i > 0; i++) {
            System.out.println(i + " ");
        }

    }

}
