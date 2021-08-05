package org.example;

import org.example.test.Ain;
import org.example.test.AinProcy;
import org.example.test.AinSon;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Ain ain = new AinProcy(new AinSon()).getProxy();
        System.out.println(ain);
//        ain.doSomething("gaga");
    }
}
