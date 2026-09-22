package application;

import java.util.Locale;
import java.util.Scanner;

public class AppAccount {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number: ");
        int numb = sc.nextInt();
        System.out.println("Enter Account Holder");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("Is there a initial deposit? (y/n)");
        char response = sc.next().charAt(0);


        sc.close();
    }
}
