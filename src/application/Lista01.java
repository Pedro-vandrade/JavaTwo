package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Lista01 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // instanciando o tipo list, temos arraylits e linkedlist
        List<Integer> nums = new ArrayList<>();
        System.out.print("A lista conterá quantos registros: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            nums.add(sc.nextInt());
        }
        System.out.println(nums);
        nums.add(0, 145);
        System.out.println(nums);
        nums.remove(1);
        System.out.println(nums);






        sc.close();
    }
}
