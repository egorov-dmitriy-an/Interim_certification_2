import java.util.ArrayList;
import java.util.Scanner;

class Editor {
    public static void newWeight (ArrayList <Toy> arrToy){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите id:");
        int id = in.nextInt();
        System.out.println("Введите новый вес:");
        arrToy.get(id-1).weight = in.nextInt();
    }
}
