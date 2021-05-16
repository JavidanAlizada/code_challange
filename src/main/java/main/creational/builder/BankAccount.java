package main.creational.builder;

import java.time.LocalDateTime;

public class BankAccount {
    private String accountId;
    private String accountName;
    private String ownerName;
    private String branchName;
    private String address;
    private String balance;
    private LocalDateTime createdOn;
    private boolean active;


    public BankAccount(BankAccountBuilder builder) {
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.ownerName = builder.ownerName;
        this.branchName = builder.branchName;
        this.address = builder.address;
        this.balance = builder.balance;
        this.createdOn = builder.createdOn;
        this.active = builder.active;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getAddress() {
        return address;
    }

    public String getBalance() {
        return balance;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", accountName='" + accountName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", branchName='" + branchName + '\'' +
                ", address='" + address + '\'' +
                ", balance='" + balance + '\'' +
                ", createdOn=" + createdOn +
                ", active=" + active +
                '}';
    }

    public static class BankAccountBuilder {
        private String accountId;
        private String accountName;
        private String ownerName;
        private String branchName;
        private String address;
        private String balance;
        private LocalDateTime createdOn;
        private boolean active;

        public BankAccountBuilder(String accountId) {
            this.accountId = accountId;
        }

        public BankAccountBuilder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public BankAccountBuilder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public BankAccountBuilder branchName(String branchName) {
            this.branchName = branchName;
            return this;
        }

        public BankAccountBuilder address(String address) {
            this.address = address;
            return this;
        }

        public BankAccountBuilder balance(String balance) {
            this.balance = balance;
            return this;
        }

        public BankAccountBuilder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        public BankAccountBuilder isActive(boolean active) {
            this.active = active;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
