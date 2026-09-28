//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.
package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor03 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos pessoas terão seus dados informados :");
        int numpessoas = sc.nextInt();
        // criando 3 vetores, p/ idade, altura, nome
        String[] nome = new String[numpessoas];
        int[] idade = new int[numpessoas];
        double[] altura = new double[numpessoas];

        for (int i = 0; i < numpessoas; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }
        double soma = 0.0;
        for (int i = 0; i < altura.length; i++) {
            soma = soma + altura[i];
        }
        double mediaAltura = soma / altura.length;
        System.out.printf("Altura média: %.2f%n", mediaAltura);

        int count = 0;
        // Aqui nesse for vamos percorrer o vetor e procurar
        // o item no vetor idades que seja menor que 16
        // criando a var count que irá receber todos indices com menos de 16 no veotr idades
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 16) {
                count = count + 1;
            }
        }
        double percent = count * 100.0 / idade.length;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% ", percent);
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 16) {
                System.out.print(nome[i]);
            }

            sc.close();
        }
    }
}
