package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class AppAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter Account Number: ");
        int number = sc.nextInt();
        System.out.print("Enter Account Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there a initial deposit? (y/n) ");
        char response = sc.next().charAt(0);
        if (response == 'y' || response =='Y') {
            System.out.print(("Enter initial deposit value: "));
            double initialdeposit = sc.nextDouble();
            account = new Account(number, holder, initialdeposit);
        } else {
            account = new Account(number, holder);
        }
        System.out.println("Accound Data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double dValue = sc.nextDouble();
        account.deposit(dValue);
        System.out.println("Updated account data");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double wValue = sc.nextDouble();
        account.withdraw(wValue);
        System.out.println("Updated account data");
        System.out.println(account);



        sc.close();
    }
}
