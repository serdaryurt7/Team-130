package day18_scope;

public class C04_BaskaClassdanVariableVeMethodKullanimi {
    public static void main(String[] args) {

        // baska class'dan static class üyesi kullanmak için,
        // classIsmi.staticUyeIsmi yazmaniz yeterlidir.

        System.out.println(C03_Scope_ClassVariableKullanim.s); // null
        System.out.println(C03_Scope_ClassVariableKullanim.a); // 0
        C03_Scope_ClassVariableKullanim.method1(); // static method calisti

        // static olmayan üyelere ulaşmak için ise kullanmak istediğimiz class'dan obje oluşturmalıyız.

        C03_Scope_ClassVariableKullanim obj = new C03_Scope_ClassVariableKullanim();
        System.out.println(obj.chr); // hiclik
        System.out.println(obj.bl); // false
        obj.method2(); // static olmayan method calisti

        // static olan bir class üyesine, static olmayan yolla uşamak istersek
        // java kullanmamıza itiraz etmez ama intelliJ bizi uyarır.
        // Static member 'day18_scope.C03_Scope_ClassVariableKullanim.s' accessed via instance reference
        // static bir class üyesine, static olmayan bir yöntemle ulaşıyorsun

        System.out.println(obj.s); // null
        System.out.println(obj.a); // 0
        obj.method1(); // static method calisti

    }
}
