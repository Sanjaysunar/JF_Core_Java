package jf_01basic;

public class Fun_method {
    public static void main(String[] args) {
        System.out.println("Before Call");
        fun();
        System.out.println("After Call");
    }

    private static void fun() {
        System.out.println("Inside Call");
    }

}
