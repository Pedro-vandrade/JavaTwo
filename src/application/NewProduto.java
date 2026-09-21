package application;

import entities.Product;
import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class NewProduto {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto product = new Produto();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.setName("PC");
        System.out.println(product.getName());
//        product.name = sc.nextLine();

        System.out.print("Price: ");
//        product.price = sc.nextDouble();
        product.setPrice(950.00);
        System.out.println(product.getPrice());

        System.out.print("Quantity in stock: ");
        product.setQuantity(sc.nextInt());

        System.out.println("Product " + product);
        System.out.println();


//        System.out.println("Enter the numbers of products to be added in stock: ");
//        int quantity = sc.nextInt();
//        product.addProducts(quantity);
//        System.out.println("Updated Data: " + product);
//
//        System.out.println("Enter the numbers of products to be removed from stock: ");
//        quantity = sc.nextInt();
//        product.removeProducts(quantity);
//        System.out.println("Updated Data: " + product);



//        System.out.println(product.name +" | " + product.price + " | " + product.quantity);


        sc.close();
    }
}