package jf_01basic;

public class methodTest1 {
    public static void main(String[] args) {
        int x = 5, y = 10;
        System.out.println(getMax(x,y));
    }

    private static int getMax(int x, int y) {
        if ( x > y)
            return x;
        else
            return y;
    }
}
