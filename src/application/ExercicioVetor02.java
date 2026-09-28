package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor02 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números serão digitados :");
        int n = sc.nextInt();
//      aqui colocando valores reais no vetor
        double[] vect = new double[n];

        for (int i=0; i< vect.length; i++) {
            System.out.println("Digite os números: ");
            vect[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < vect.length; i ++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.print("Números: ");
        System.out.println(Arrays.toString(vect));
        System.out.printf("Soma: %.2f%n" , sum);
        System.out.printf("Media: %.2f%n " , avg);


        sc.close();
    }
}
