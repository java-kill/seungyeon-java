package ch07.객체지향2;

class MyPoint {
    int x;
    int y;
}

class Circle extends  MyPoint { //상속
    int r;
}

public class ex07_InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x = 1;
        c.y = 2;
        c.r = 3;

        System.out.println("c.x="+c.x);
        System.out.println("c.y="+c.y);
        System.out.println("c.r="+c.r);
    }
}
