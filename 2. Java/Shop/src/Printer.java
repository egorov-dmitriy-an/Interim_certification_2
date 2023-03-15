import java.util.ArrayList;

public class Printer {

    public static void printToy(ArrayList<Toy> prod){
        System.out.println("id\tname\tcount\tweight");
        for (Toy t : prod) {
            System.out.println(t.id_toy + "\t" + t.name_toy + "\t" + t.count + "\t" + "\t" + t.weight);
        }
    }
}
