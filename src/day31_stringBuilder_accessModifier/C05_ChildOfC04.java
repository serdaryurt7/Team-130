package day31_stringBuilder_accessModifier;

public class C05_ChildOfC04 extends C04_AccessModifier {

    public static void main(String[] args) {

        /*
            Aynı package içinde, farklı bir class'tayiz ama child class'dayiz
         */

        C04_AccessModifier obj = new C04_AccessModifier();
        // System.out.println(obj.strPrivate);

        System.out.println(obj.sayiDefault);
        obj.sayiDefault = 30;

        obj.blProtected = true;
        System.out.println(obj.blProtected);

        obj.methodPublic();

    }

}
