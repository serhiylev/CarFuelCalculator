public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car("чорний", "ферарі", 12, 30, 13000);
        ferrari.drive(69);
        ferrari.drive(400);
        ferrari.drive(30000);
        ferrari.reFuel(25);
        ferrari.drive(400);
        ferrari.distance();
    }
}
