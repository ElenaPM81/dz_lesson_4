package ru.gb.lesson4;




import java.util.Scanner;

public class Account {
    public static void main(String[] args) throws InsufficientFundsException {


        int initial_account_balance;
        try {
            Scanner cash = new Scanner(System.in);
            System.out.println("Введите начальный баланс счета: ");
            initial_account_balance = cash.nextInt();

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }


        if (initial_account_balance < 0)
            throw new IllegalArgumentException("введен отрицательный начальный баланс");
        System.out.println("Начальный баланс счета: \n" + initial_account_balance + " р");

        Scanner cash2 = new Scanner(System.in);
        System.out.println("Введите сумму средств :");
        int sum_cash2 = cash2.nextInt();
        int account_balance = initial_account_balance + sum_cash2;
        System.out.println("Остаток на счете: \n" + account_balance + " р");
        int sum_dep;
        try {

            Scanner dep = new Scanner(System.in);
            System.out.println("Введите сумму депозита :");
            sum_dep = dep.nextInt();
            account_balance = sum_dep + account_balance;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        if (sum_dep < 0)
            throw new IllegalArgumentException("депозит с отрицательным значением");
        System.out.println("Остаток на счете: \n" + account_balance + " р");

        int cash_withdrawal;
        int withdrawal_of_funds;
        try {

            Scanner sum = new Scanner(System.in);
            System.out.println("Укажите необходимую сумму для снятия :");
            cash_withdrawal = sum.nextInt();
            withdrawal_of_funds = account_balance - cash_withdrawal;
            System.out.println("Выдача наличных :\n" + cash_withdrawal + " р");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        if (cash_withdrawal > account_balance)
            throw new InsufficientFundsException("сумма снятия превышает остаток на счете");
        System.out.println("Остаток на счете:\n" + withdrawal_of_funds + "р");
    }


}


















