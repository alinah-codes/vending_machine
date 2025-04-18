package model;
import interfaces.PaymentReceiver;

import java.util.Scanner;

public class CardAcceptor implements PaymentReceiver {
    private int amount;

    public CardAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void addMoney(int money) {
        this.amount += money;
    }

    public void payByCard() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер карты (16 цифр): ");
        String cardNumber = scanner.nextLine();

        if (!cardNumber.matches("\\d{16}")) {
            System.out.println("Неверный номер карты!");
            return;
        }

        System.out.print("Введите код подтверждения (4 цифры): ");
        String code = scanner.nextLine();

        if (!code.matches("\\d{4}")) {
            System.out.println("Неверный код!");
            return;
        }

        System.out.print("Введите сумму для пополнения: ");
        int money = scanner.nextInt();

        addMoney(money);
        System.out.println("Баланс пополнен на " + money);
    }
}
