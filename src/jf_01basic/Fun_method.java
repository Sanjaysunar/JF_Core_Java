package jf_01basic;

public class Fun_method {
    public static void main(String[] args) {
        System.out.println("Before Call");
        fun1();
        System.out.println("After Call");
    }

    private static void fun1() {
        System.out.println("fun1() Begins");
        fun2();
        System.out.println("fun1() Ends");
    }

    private static void fun2() {
        System.out.println("Inside fun2()");
    }

}
