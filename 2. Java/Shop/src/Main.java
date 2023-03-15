import java.util.ArrayList;
import java.util.Scanner;


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
        ArrayList<Toy> lottery = new ArrayList<>();

        Printer.printToy(product);

        Scanner in = new Scanner(System.in);
        boolean stop = true;
        while (stop == true) {
            System.out.println("Введите команду:" +
                    "\n1 - Показать все игрушки" +
                    "\n2 - Добавить новую игрушку" +
                    "\n3 - Провести розыгрыш игрушки" +
                    "\n4 - Изменить параметр розыгрыша игрушки" +
                    "\n5 - Показать розыгранные игрушки" +
                    "\n0 - Завершить");
            String key = in.nextLine();
            System.out.print("\033[H\033[J");
            switch (key) {
                case "1":
                    Printer.printToy(product);
                    break;
                case "2":
                    product.add(AddToy.add());
                    break;
                case "3":
                    System.out.println("Метод розгрыша");
                    break;
                case "4":
                    Editor.newWeight(product);
                    break;
                case "5":
                    if (lottery.size() == 0) {
                        System.out.println("Розыгрышей не было");
                    }
                    else {
                        Printer.printToy(lottery);
                    }
                    break;
                case "0":
                    stop = false;
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Такой команды нет");
                    break;
            }
        }
    }
}
