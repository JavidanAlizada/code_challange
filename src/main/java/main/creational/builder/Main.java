package main.creational.builder;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount.BankAccountBuilder("ACxNBCJ4892310931NCFJ")
                .accountName("AABfu3982BCHF")
                .address("Azerbaijan")
                .balance("5000")
                .ownerName("Javidan")
                .build();
        System.out.println(account.getBalance());
    }
}
