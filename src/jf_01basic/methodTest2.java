package jf_01basic;

public class methodTest2 {
    public static void main(String[] args) {
        int x = 5;
        fun(x);
        System.out.println(x);
    }

    private static void fun(int x) {
        x = x + 5;
        System.out.println(x);
    }
}
