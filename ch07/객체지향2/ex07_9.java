package ch07.객체지향2;
class Product2{
    int price;
    int bonusPoint;

    Product2(int price){
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }

    Product2() {} //기본생성자
}

class Tv2 extends Product2 {
    Tv2() {super(100);}

    public String toString() { return "Tv"; }
}

class Computer2 extends Product2 {
    Computer2() {super(200);}

    public String toString() { return "Computer"; }
}

class Audio2 extends Product2 {
    Audio2() {super(50);}

    public String toString() { return "Audio"; }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10]; //구입한 제품을 저장하기 위한 배열
    int i = 0; //Product배열에 사용될 카운터

    void buy(Product2 p){
        if(money < p.price){
            System.out.println("잔액부족");
            return;
        }
        money -= p.price; //money = money - p.price
        bonusPoint += p.bonusPoint; // bonusPoint = bonusPoint + p.bonusPoint
        cart[i++] = p;
        System.out.println(p + "구입완료");
    }

    //구입한 물품에 대한 정보를 요약하는 메서드
    void summary(){
        int sum = 0; //구입한 물품의 가격합계
        String itemList=""; //구입한 물품목록

     //반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for(int i = 0; i < cart.length; i++){
            if(cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i].toString() +", ";
        }
        System.out.println("구입하신 물품의 총금액은" + sum + "만원입니다");
        System.out.println("구입하신 제품은" + itemList + "입니다");
    }
}

public class ex07_9 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();
    }
}
