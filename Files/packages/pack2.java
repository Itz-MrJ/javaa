package p2;

import p1.*;

class D extends A{
    void display2(){
        A obj = new A();
        System.out.println("class D\nAn example for keyword: protected");
        // System.out.println(A.name); Since A.name is protected, it is not possible for you to access the name variable.
    }
}

class E{
    void display2(){
        // B obj = new B(); Since class B is not public, it is not possible to access it.
        System.out.println("class E\nAn example for keyword: default");
    }
}