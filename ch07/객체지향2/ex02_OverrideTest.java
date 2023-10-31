package ch07.객체지향2;
class MyPoint3{
    int x;
    int y;
    String getLocation(){
        return "x:"+x+", y:"+y;
    }
}

class MyPoint3D extends MyPoint3 {
    int z;
}

public class ex02_OverrideTest {
    public static void main(String[] args) {
        MyPoint3D p = new MyPoint3D(); //상속받은 MyPoint3D 객체생성
        p.x = 3;
        p.y = 5;
        p.z = 7;
        System.out.println(p.getLocation());
    }
}
