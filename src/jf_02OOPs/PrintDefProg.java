package jf_02OOPs;

class Pointdef{
    int x,y;
    void print(){
        System.out.println("x="+x+" y="+y);
    }
}
public class PrintDefProg {
    public static void main(String[] args) {
        Pointdef p = new Pointdef();
        p.print();
    }
}
