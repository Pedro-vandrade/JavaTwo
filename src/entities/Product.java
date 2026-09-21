package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalvaluestock () {
        return price * quantity;
    }

//  p referenciar o atrib da classe usamos o this, uma auto referencia para o objeto
//  sendo usado para referenciar o atributo da classe
    public void addProducts (int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString () {
    return name
            + ", $"
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units,  total: $ "
            + String.format("%.2f", totalvaluestock())
            ;

    }
}


