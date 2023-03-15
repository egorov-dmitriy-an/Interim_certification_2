import java.util.ArrayList;

class Printer {

    public static void printToy(ArrayList<Toy> prod) {
        System.out.println("id\tname\tcount\tweight");
        for (Toy t : prod) {
            System.out.println(t.id_toy + "\t" + t.name_toy + "\t" + t.count + "\t" + "\t" + t.weight);
        }
    }

    public static void printToyLot(ArrayList<Toy> prod) {
        System.out.println("id\tname");
        for (Toy t : prod) {
            System.out.println(t.id_toy + "\t" + t.name_toy);
        }
    }
}