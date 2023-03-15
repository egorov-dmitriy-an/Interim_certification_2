import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Toy auto = new Toy(1, "Lada", 20, 50);
        Toy puppe = new Toy(2, "Masha", 20, 50);
        Toy candy = new Toy(3, "Chuppa", 50, 90);
        Toy pad = new Toy(4, "iPad", 5, 10);

        ArrayList<Toy> product = new ArrayList<>();
        product.add(auto);
        product.add(puppe);
        product.add(candy);
        product.add(pad);

        Printer.printToy(product);
    }
}