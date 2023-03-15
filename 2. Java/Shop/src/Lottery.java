import java.util.ArrayList;
import java.util.Random;

public class Lottery {
    public static int lott(ArrayList<Toy> prod) {
        Random r = new Random();
        int wg = r.nextInt(99) + 1;

        ArrayList<Toy> forLott = new ArrayList<>();
        for (Toy t : prod) {
            if (t.weight > wg) {
                forLott.add(t);
            }
        }
        int idLot;
        int idResult;
        if (forLott.size() == 0) {
            System.out.println("Победителя нет =(");
            idResult = 0;
        } else {
            idLot = r.nextInt(forLott.size()) + 1;
            idResult = forLott.get(idLot - 1).id_toy;
            System.out.println("Приз: " + forLott.get(idLot - 1).name_toy);
        }
        return idResult;
    }
}