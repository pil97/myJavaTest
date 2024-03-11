package poly.ex.pay1;

import java.util.Scanner;

public class PayMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.print("결제 방법을 선택해주세요 : ");
        String payName = scanner.nextLine();
        user.paySet(payName);
    }
}