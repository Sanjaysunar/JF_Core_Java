package jf_01basic;

class Point {
    int x, y;
}
public class methodTest3 {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 5;
        p.y = 10;
        fun(p);
        System.out.println(p.x+" "+p.y);
    }

    private static void fun(Point p) {
        p.x = 10;
        p.y = 10;
    }

}
