package poly.ex.pay1;


// 추상 클래스 - 그안에 메서드만 사용해야하기 때문
//  -> 인스턴스 생성을 막기위해.
public abstract class PayChoice {

    // 결제수단 확인 조건문 - 다형성 업캐스팅
    // 부모 인터페이스를 구현한 자식 클래스들은 같은 메서드에 쓸려면 다형성을 활용해야함.
    public static Pay findPay(String option) {

        if (option.equals("kakao")) {
            return new KaKaoPay();
        } else {
            return new DefaultPay();
        }
    }
}
