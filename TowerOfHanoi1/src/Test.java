/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARCUS
 */
public class Test implements Runnable {

    public static void main(String[] args) {
        new Test();
    }

    public Test() {
       
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("test");
    }
}
