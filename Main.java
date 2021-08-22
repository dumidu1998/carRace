import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Car Racers Sri Lanka!!!");
        System.out.println("Lets register some cars first!\n");

        System.out.println("Enter the unique number of a car: ");
        String uniqueid = scanner.nextLine();
        System.out.println("Enter the brand of the car: ");
        String brand = scanner.nextLine();
        System.out.println("Enter the sponsor of the car: ");
        String sponsor = scanner.nextLine();
        System.out.println("Enter the driver name of the car: ");
        String driver = scanner.nextLine();

        Car car1 = new Car(uniqueid, brand, sponsor, driver);

        car1.printCar();

        System.out.println(uniqueid + " " + brand + " " + sponsor + " " + driver);

    }

}
