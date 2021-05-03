package com.test;

class A {
   void f() {
        System.out.print("A.f() ");
    }

    A() {
        System.out.print("Before A.f() ");
        f();
        System.out.print("After A.f() ");
    }
}

class B extends A {
    B() {
        System.out.print("Cons B ");
    }

    void f() {
        System.out.print("B.f() ");
    }
}

public class PereopredelenieBazovyhMetodov {
    public static void main(String[] args) {
        new B();
    }
}

//если методы превратить в статические, то тогда вызовется метод базового класса