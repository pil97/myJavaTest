package poly.ex.pay1;

import java.util.Scanner;

public class User {

    private int balance;

    // 결제 프로세스 - 종합
    public void paySet(String option) {

        Pay result = PayChoice.findPay(option);

        // 결제 수단 출력 코드
        if(result.payResult()) {
            System.out.println(option + "시스템 작동.");
            payProcess();
        } else {
            System.out.println("잘못된 결제수단입니다.");
        }
    }

    // 입금액 설정
    private void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원 입금됐습니다.");
    }

    // 출금액 설정
    private void withDraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금됐습니다.");
        } else {
            System.out.println("잔고가 부족합니다. 현재 잔고 : " + balance);
        }
    }

    // 메서드 - 걀제 입출금 프로세스
    private void payProcess() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. 입금 || 2. 출금 || 3. 종료");
            System.out.print("결제 옵션을 선택해주세요 : ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("입금액을 입력해주세요 : ");
                int amount = scanner.nextInt();
                deposit(amount);
            } else if (choice == 2) {
                System.out.print("출금액을 입력해주세요 : ");
                int amount = scanner.nextInt();
                withDraw(amount);
            } else if (choice == 3) {
                System.out.println("시스템이 종료됩니다.");
                System.out.println("현재 잔액 : " + balance);
                break;
            } else {
                System.out.println("잘못된 옵셥입니다.");
            }
        }
    }
}
