package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor01 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números serão digitados :");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i=0; i<vect.length; i++) {
            vect[i] = sc.nextInt();
        }
        for (int i=0; i <vect.length; i++){
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
//        System.out.print(Arrays.toString(vect));

        sc.close();
    }
}
//int[] vetor = new int[n];: Aloca o array na memória para caber a quantidade n informada.
//
//Primeiro loop (for): Percorre os índices de 0 até n - 1,
// guardando cada entrada do usuário com vetor[i] = scanner.nextInt().
//
//Segundo loop (for): Percorre novamente o vetor testando a condição vetor[i] < 0.
// Se o número for menor que zero, ele é exibido no console.