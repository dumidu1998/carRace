import java.util.Scanner;

public class Main {

    private static int carcount = 0;
    private static Car[] cararray = new Car[6];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Car Racers Sri Lanka!!!");
        System.out.println("Lets register some cars first!\n");

        while (true) {
            System.out.println(
                    "Enter Operation: \n[1] - Register new Car\n[2] - View All Cars\n[3] - Search by car Id\n[4] - Search by driver Name\n[5] - Delete a car\n");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    cararray[carcount] = RegisterCar();
                    break;
                case 2:
                    ViewAllCars();
                    break;
                case 3:
                    ViewAllCars();
                    break;
                case 4:
                    ViewAllCars();
                    break;
                case 5:
                    ViewAllCars();
                    break;
            }
        }

    }

    public static Car RegisterCar() {
        if (carcount == 5) {
            System.out.println("Sorry, we can't register more cars.\n");
            return null;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the unique number of a car: ");
        String uniqueid = scanner.nextLine();
        System.out.println("Enter the brand of the car: ");
        String brand = scanner.nextLine();
        System.out.println("Enter the sponsor of the car: ");
        String sponsor = scanner.nextLine();
        System.out.println("Enter the driver name of the car: ");
        String driver = scanner.nextLine();

        Car car1 = new Car(uniqueid, brand, sponsor, driver);
        carcount++;
        return car1;
    }

    public static void ViewAllCars() {
        for (int i = 0; i < carcount; i++) {
            cararray[i].printCar();
        }
    }

    public static void DeleteCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the unique number of a car to be deleted: ");
        String uniqueid = scanner.nextLine();
        for (int i = 0; i < carcount; i++) {
            if (cararray[i].getUniqueId().equals(uniqueid)) {
                cararray[i] = null;
                carcount--;
            }
        }
    }

}
