package ru.gb.lesson4;

public class InsufficientFundsException extends Throwable {
    public InsufficientFundsException(String s) {
        System.out.println("сумма снятия превышает остаток на счете");
    }
}
