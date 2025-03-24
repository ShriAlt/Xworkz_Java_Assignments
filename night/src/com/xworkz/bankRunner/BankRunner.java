package com.xworkz.bankRunner;

import com.xworkz.bank.Account;
import com.xworkz.bank.Bank;
import com.xworkz.bank.Customer;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.branch="manglore";

        Customer customer=new Customer();
        Account account=new Account();

        customer.customerStatus="ok";
        account.type=true;
        account.displayAccount();

    }
}
