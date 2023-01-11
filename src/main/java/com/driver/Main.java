package com.driver;

public class Main {

    static class A{
        String meth(){
            return "Invoking method from class A";
        }
    }
    static class B extends A{
        @Override
        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        A o1 = new A();
        System.out.println(o1.meth());
        A o2 = new B();
        System.out.println(o2.meth());
    }
}