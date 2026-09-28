package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Lista02 {
     static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();

        System.out.print("A lista conterá quantos registros: ");
        int n = sc.nextInt();
        sc.nextLine(); //

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o %dº nome: ", i + 1);
            nomes.add(sc.nextLine());
        }
        // aqui imprime nomes com quebra de linha um por um
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println(nomes.size());
        System.out.println("-".repeat(20));
        // aqui uma função lambda = predicado - e colocando para maiuscula
        nomes.removeIf(x -> Character.toUpperCase(x.charAt(0)) == 'H');
        // aqui imprime a lista
        System.out.println(nomes);
        System.out.println("-".repeat(20));
        String indice = nomes.get(2);
        System.out.println(indice);
        // aqui estamos fazendo uma segunda lista com o predicoado - item na lista
         // que tenha a inicial V(maisuculo)
        List<String> result = nomes.stream().filter(x -> x.charAt(0) == 'V').toList();
        //String name = nomes.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
        System.out.print(result);


        sc.close();
    }
}