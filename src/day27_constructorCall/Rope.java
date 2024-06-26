package day27_constructorCall;

public class Rope {

    public static void swing() {
        System.out.println("swing ");
    }

    public void climb() {
        System.out.println("climb ");
    }

    public static void play() {
        swing();
        // climb();

    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null; // obje oluşturulmadığı için rope2 ile method çağrılamaz
        rope2.play();


        // String str;
        // System.out.println(str); // Değer vermeden localde variable oluşturulabilir. Değer vermeden kullanılmaz. CTE VERİR


    }

}
