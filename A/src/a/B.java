/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.LinkedList;

/**
 *
 * @author MARCUS
 */
public class B extends A {
    public void print() {
        System.out.println("B");
    }

    public void printObject(B b) {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        LinkedList<A> alist = new LinkedList<>();
        alist.add(a);
        alist.add(b);
        LinkedList<B> blist = new LinkedList<>();
        blist.add(b);
       // ((B) a).print();
        ((A) b).print();
        A.printAll(alist);
       // b.printAll(blist);
        a.printObject(b);
//        b.printObject((B) a);
        b.printObject((A) b);
    }

}

