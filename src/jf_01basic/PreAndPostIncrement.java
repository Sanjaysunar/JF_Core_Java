package jf_01basic;

public class PreAndPostIncrement {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a += 5; // a = a+5
        b *= 4; // b = b*4
        c += a*b;
        System.out.println(c);

        c %= 6;
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
    }
}
