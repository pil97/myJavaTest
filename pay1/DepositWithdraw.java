package poly.ex.pay1;

public abstract class DepositWithdraw {

    private static int balance;

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



