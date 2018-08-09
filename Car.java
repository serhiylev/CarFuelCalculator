public class Car {
    private String color;
    private String brend;//марка
    private double fuelDissipation; // розхіда на 1 км
    private double amountOfFuelInTheTank;//обʼєм пального в баці
    private double carMileage;//пробіг
    private double spentFuel;

    void drive(double km) {
        spentFuel = fuelDissipation * km;
        if (spentFuel < amountOfFuelInTheTank) {
            carMileage += km;
            System.out.println(color + " " + brend + " проїхав" + String.format("%.2f", km) + "км  загальний пробіг " + String.format("%.2f", carMileage));
            amountOfFuelInTheTank = amountOfFuelInTheTank - spentFuel;
        } else if (amountOfFuelInTheTank == 0) {
            System.out.println("Пального немає, заправте машину");
        } else {
            km = amountOfFuelInTheTank / fuelDissipation;
            carMileage += km;
            System.out.println(color + " " + brend + " проїхав " + String.format("%.2f", km) + "км  загальний пробіг " + String.format("%.2f", carMileage));
            amountOfFuelInTheTank = 0;
        }
    }
    void reFuel(int fuelVolume) {
        System.out.println("Машина заправлена на " + fuelVolume +" літрів");
        amountOfFuelInTheTank += fuelVolume;
    }

    void distance() {
        System.out.println("колір - " + color +
                "\nмарка - " + brend +
                "\nрозхід - " + fuelDissipation*100 +
                "\nоб'єм пального в баці - " + amountOfFuelInTheTank +
                "\nпробіг - " + String.format("%.2f", carMileage));
    }

    Car(String color, String brend, int fuelDissipation, int amountOfFuelInTheTank, int carMileage) {
        this.color = color;
        this.brend = brend;
        this.fuelDissipation = (fuelDissipation*0.01);
        this.carMileage = carMileage;
        this.amountOfFuelInTheTank = amountOfFuelInTheTank;
    }
}
