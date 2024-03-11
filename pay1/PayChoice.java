package poly.ex.pay1;

public abstract class PayChoice {
    // 결제수단 확인 조건문
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return new KaKaoPay();
        } else {
            return new DefaultPay();
        }
    }
}
