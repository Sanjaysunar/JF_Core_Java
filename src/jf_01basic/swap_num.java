package jf_01basic;

public class swap_num {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0;

        System.out.println("Before Swap "+ a + " "+ b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap "+ a + " "+ b);
    }
}
