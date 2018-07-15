/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author MARCUS
 */
public  class A {

    public void print() {
        System.out.println("A");
    }

    public void printObject(A a) {
        System.out.println("A");
    }

    public static void printAll(List<A> list) {
        for (A a : list) {
            a.print();
        }
    }
}

