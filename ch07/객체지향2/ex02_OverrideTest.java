package ch07.객체지향2;

class MyPoint3{
    int x;
    int y;

    MyPoint3(int x, int y){
        this.x = x;
        this.y = y;
    }

//    String getLocation(){
//        return "x:"+x+", y:"+y;
//    }

    //Object 클래스의 toString()을 오버라이딩
    public String toString(){
        return "x:"+x+", y:"+y;
    }
}

//class MyPoint3D extends MyPoint3 {
//    int z;
//
//    //조상의 getLocation 오버라이딩
//    String getLocation(){
//        return "x:"+x+", y:"+y+", z:"+z;
//    }
//}

public class ex02_OverrideTest {
    public static void main(String[] args) {
        MyPoint3 p = new MyPoint3(3,5);
//        p.x = 3;
//        p.y = 5;
        System.out.println(p);
        //System.out.println(p.toString());
    }
}
