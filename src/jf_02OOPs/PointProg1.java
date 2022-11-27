package jf_02OOPs;

class Point1{
    int x, y;
    Point1( int x, int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        System.out.println("x = "+x +" y = "+ y);
    }
}
public class PointProg1 {
    public static void main(String[] args) {
        Point1 p1 = new Point1(10, 20);
        p1.print();
        Point1 p2 = new Point1(5,15);
        p2.print();
    }
}
