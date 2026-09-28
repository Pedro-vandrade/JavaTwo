package application;
// sintaxe opicional simplificada para percorrer colções
public class ForEach {
    static void main(String[] args) {


        String [] vect = new String[] {"Haroldo", "Rue", "Vica"};
        for (int i =0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        System.out.println("-".repeat(20));
        // Laço for each
        for (String item : vect) {
            System.out.println(item);
        }
    }
}
