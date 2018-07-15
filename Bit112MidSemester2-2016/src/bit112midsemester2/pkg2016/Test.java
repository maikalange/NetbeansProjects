/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112midsemester2.pkg2016;

/**
 *
 * @author MARCUS
 */
public class Test extends A {

    public static void main(String[] args) {
        Test t = new Test();
        t.print();
    }
}

class A {

    String s;

    A() {
    }

    A(String s) {
        this.s = s;
    }

    public void print() {
        System.out.println(s);
    }
}
