import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Toy auto = new Toy(1, "Лада", 20, 50);
        Toy puppe = new Toy(2, "Кукла", 20, 50);
        Toy candy = new Toy(3, "Чупс", 50, 90);
        Toy pad = new Toy(4, "iPad", 5, 10);

        ArrayList<Toy> product = new ArrayList<>();
        product.add(auto);
        product.add(puppe);
        product.add(candy);
        product.add(pad);
        ArrayList<Toy> lottery = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        boolean stop = true;
        while (stop) {
            System.out.println("""
                    Введите команду:
                    1 - Показать все игрушки
                    2 - Добавить новую игрушку
                    3 - Провести розыгрыш игрушки
                    4 - Изменить параметр розыгрыша игрушки
                    5 - Показать розыгранные игрушки
                    0 - Завершить""");
            String key = in.nextLine();
            System.out.print("\033[H\033[J");
            switch (key) {
                case "1" -> Printer.printToy(product);
                case "2" -> product.add(AddToy.add());
                case "3" -> {
                    int idWin = Lottery.lott(product);
                    for (Toy t : product) {
                        if (t.id_toy == idWin) {
                            lottery.add(t);
                            t.count--;
                        }
                    }
                }
                case "4" -> Editor.newWeight(product);
                case "5" -> {
                    if (lottery.size() == 0) {
                        System.out.println("Розыгрышей не было");
                    } else {
                        Printer.printToyLot(lottery);
                    }
                }
                case "0" -> {
                    stop = false;
                    System.out.println("До свидания!");
                }
                default -> System.out.println("Такой команды нет");
            }
        }
    }
}