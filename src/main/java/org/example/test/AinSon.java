package org.example.test;

public class AinSon implements Ain,Ain2 {
    @Override
    public void doSomething(String s) {
        System.out.println("go");
        System.out.println(s);
        System.out.println("end");
    }

    @Override
    public void gaga() {
        System.out.println("gaga!");
    }
}
