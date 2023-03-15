import java.util.Scanner;

public class AddToy {
    public static Toy add(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите id:");
        int id = in.nextInt();
        System.out.println("Введите название:");
        String name = in.next();
        System.out.println("Введите количетво:");
        int count = in.nextInt();
        System.out.println("Введите вес:");
        int weight = in.nextInt();
        return new Toy(id, name,count, weight);
    }
 }

