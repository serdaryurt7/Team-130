package day41_exceptions_iterator;

public class C01_Exceptions {

    public static void main(String[] args) {

        int sayi = 2;
        // eger sayi negatifse sadece 1.satir çalışsın, sonra 5. satırdan sonra normal çalışmaya devam etsin
        // sayi çift ise 1.2. satır çalışsın, sonra 5. satırdan sonra normal çalışmaya devam etsin
        // diğer durumlarda 5 satırda çalışsın


        try {
            System.out.println("satir1");
            if (sayi < 0) throw new IllegalArgumentException();
            System.out.println("satir2");
            if (sayi % 2 == 0) throw new RuntimeException();
            System.out.println("satir3");
            System.out.println("satir4");
            System.out.println("satir5");
        } catch (IllegalArgumentException e) {
            System.out.println("Sayi negatif oldugundan 2,3,4,5 atlandi");
        } catch (RuntimeException e) {
            System.out.println("Sayi cift oldugundan 3,4,5 atlandi");
        }

        System.out.println("buradan itibaren calismaya devam");
    }

}
