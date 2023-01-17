package com.driver;

public class Main {

   public static class A{
        String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        @Override
        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        B o1 = new B();
        o1.meth();
        B o2 = new B();
        o2.meth();
    }
}