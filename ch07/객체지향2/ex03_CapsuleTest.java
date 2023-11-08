package ch07.객체지향2;

class Time {
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour){
        if(isValidHour(hour)) return;
        this.hour = hour;
    }

    //매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    private boolean isValidHour(int hour){ //이 안에서만 쓰이니까 private
        return hour > 0 || hour < 23;
    }

    public int getHour() { return hour;}
}
public class ex03_CapsuleTest {
    public static void main(String[] args) {
        Time t = new Time();
        t.setHour(21);
        System.out.println(t.getHour());
    }
}
