package poly.ex.pay1;

import java.util.Scanner;

// static 메서드를 import해서 코드길이 줄임.
import static poly.ex.pay1.DepositWithdraw.*;

public class User {

    // 결제 프로세스 - 종합
    public void paySet(String option) {

        // 부모 타입으로 변수 담아야함.
        // 클래스를 통한 접근 -> import 하면 생략 가능
        Pay result = PayChoice.findPay(option);

        // 결제 수단 출력 코드
        // 객체가 생성 -> 그안에 카카오페이, 페이가 같이 들어있음 -> 부모 타입(Pay)이라 먼저 부모 객체에서 찾음
        //      -> 자식 타입(카카오페이)에서 오버라이딩이 했기때문에 오버라이딩 우선!
        if(result.payResult()) {
            System.out.println(option + "시스템 작동.");
            payProcess();
        } else {
            System.out.println("잘못된 결제수단입니다.");
        }
    }

    // 결제 입출금 프로세스 메서드
    private void payProcess() {
        Scanner scanner = new Scanner(System.in);

        // static 메서드 활용
        while (true) {
            System.out.println("1. 입금 || 2. 출금 || 3. 종료");
            System.out.print("결제 옵션을 선택해주세요 : ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                // 지역 변수 활용
                System.out.print("입금액을 입력해주세요 : ");
                int amount = scanner.nextInt();
                deposit(amount);
            } else if (choice == 2) {
                // 지역 변수 활용
                System.out.print("출금액을 입력해주세요 : ");
                int amount = scanner.nextInt();
                witDraw(amount);
            } else if (choice == 3) {
                System.out.println("시스템이 종료됩니다.");
                System.out.println("현재 잔액 : " + total());
                break;
            } else {
                System.out.println("잘못된 옵셥입니다.");
            }
        }
    }
}
