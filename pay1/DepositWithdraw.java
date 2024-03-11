package poly.ex.pay1;

public abstract class DepositWithdraw {

    private static int balance;


    // static 메서드 -> 인스턴스 생성 없이 호출하기 위해 : User클래스에서 사용해야함.
    //      -> static메서드를 사용할려면 static 변수만 사용가능
    // 입금액 설정
    public static void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원 입금됐습니다.");
    }

    // 출금액 설정
    public static void witDraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금됐습니다.");
        } else {
            System.out.println("잔고가 부족합니다. 현재 잔고 : " + balance);
        }
    }

    public static int total() {
        return balance;
    }
}



