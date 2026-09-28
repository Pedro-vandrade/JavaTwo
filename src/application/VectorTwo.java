package application;

import entities.Producto;

import java.util.Locale;
import java.util.Scanner;

public class VectorTwo {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantity: ");
        int n = sc.nextInt();
        Producto[] vect = new Producto[n];
        // É possivel usar o atributo length que existe em um vetor em vez de uma variavel para
        // verificar o tamaho do vetor - vect.length
        for (int i =0; i<vect.length; i++){
            sc.nextLine();
            System.out.println("Product name: ");
            String name = sc.nextLine();
            System.out.println("Product price: ");
            double price = sc.nextDouble();
            // vect na posição I vai receber um novo produto(Producto c/ name e price
            vect[i] = new Producto(name, price);
        }
        double sum = 0;
        for(int i=0; i <vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("Average price: %.2f%n ", avg);


        sc.close();
    }
}
