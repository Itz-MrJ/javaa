package p1;


class B extends A{
    void display1(){
        System.out.println("class B\nAn example for keyword: private");
        // System.out.println(a); Since `a` is a private character declared in class A, it is not accessible even though it is inherited.
    }
}

class C{
    void display1(){
        A a = new A();
        System.out.println("class C\nAn example for keyword: public\n"+(a.num+20));
    }

}