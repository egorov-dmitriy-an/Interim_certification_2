public class Main {
    public static void main(String[] args) {
        Toy auto = new Toy(1, "Lada", 10, 50);
        System.out.println(auto.name_toy);
        auto.weight = 20;
        System.out.println(auto.weight);
    }
}