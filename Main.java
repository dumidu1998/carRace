import java.util.Scanner;

public class Main {

    private static int carcount = 0;
    private static Car[] cararray = new Car[6];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Car Racers Sri Lanka!!!");
        System.out.println("Lets register some cars first!\n");

        while (true) {
            System.out.println("Enter Operation: \n[1] - Register new Car\n[2]  - View All Cars\n[3] - Delete a Car \n[4] - Search for a Car\n");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    cararray[carcount] = RegisterCar();
                    break;
                case 2:
                    ViewAllCars();
                    break;
                case 3:
                    DeleteACar();
                     break;
                case 4:
                    SearchForACar();
                    break;
            }
        }
        // 

    }

    public static Car RegisterCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the registration  number of a car: ");
        String carId = scanner.nextLine();
        if(checkcarId(carId)){
            System.out.println("Car ID Already Taken\n");
            return null;
        };
        System.out.println("Enter the brand of the car: ");
        String brand = scanner.nextLine();
        System.out.println("Enter the sponsor of the car: ");
        String sponsor = scanner.nextLine();
        System.out.println("Enter the driver name of the car: ");
        String driver = scanner.nextLine();

        Car car1 = new Car(carId, brand, sponsor, driver);
        carcount++;
        return car1;
    }

    public static void ViewAllCars() {
        for (int i = 0; i < carcount; i++) {
            cararray[i].printCar();
        }
    }
    public static void DeleteACar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the unique number of a car to be deleted: ");
        String carid = scanner.nextLine();
        for (int i = 0; i < carcount; i++) {
            if (cararray[i].getcarId().equals(carid)) {
                cararray[i] = null;
                carcount--;
            }else{
                System.out.println("Invalid Car Id");
            }
        }
    }
    
    public static void SearchForACar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the unique number of a car to be find: ");
        String carid = scanner.nextLine();
        for (int i = 0; i < carcount; i++) {
            if (cararray[i].getcarId().equals(carid)) {
                cararray[i].printCar();  
                return;          
            }
        }
        System.out.println("Invalid Car Id");
    }

    public static void Results() {
        // input results   
        // Search
    }

    public static boolean checkcarId(String id){
        for (int i = 0; i < carcount; i++) {
            if (cararray[i].getcarId().equals(id)) {
                return true;          
            }
        }
        return false;
        
    }

}
