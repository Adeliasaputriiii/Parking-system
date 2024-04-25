import java.util.ArrayList;
import java.util.Scanner;

public  class Parking extends Vehicle{
    private static final int capacity = 10;
    private ArrayList<Vehicle> listParking;
    private ParkingSystem parkingSystem;

    public Parking(){
        super("", 0, 0, "");
        this.listParking = new ArrayList<Vehicle>();
        this.parkingSystem= new ParkingSystem();
    }

    //method untuk menambahkan kendaraan ke dalam parkir
    public void addParking(Vehicle vehicle){
        if(listParking.size() < capacity){
            int parkingNumber = parkingSystem.generateParkingNumber();//inisialisasi nilai random yang didapat.
            vehicle.parkingNumber = parkingNumber;
            listParking.add(vehicle);//menambahkan objek vehicle ke dalam list parking
            System.out.println("Parking Number: " + parkingNumber);
        }
        else{
            System.out.println("Parking area is full");
        }
    }

    public boolean leaveParking(int parkingNumber, int time, Scanner scanner){
        for (int i = 0; i < listParking.size(); i++){
            Vehicle vehicle = listParking.get(i);
            if(vehicle.getParkingNumber() == parkingNumber){
                double price = vehicle.getPrice() * time;
                listParking.remove(i);
                System.out.println("Vehicle found: ");
                System.out.println("Type vehicle: " + vehicle.getType());//pemanggilan jenis kendaraan yang tersimpan di dalam method getType pada class vehicle.
                System.out.println("Driver Name: " + vehicle.getNama());//pemanggilan nama driver yang tersimpan di dalam method pada class vehicle.
                System.out.println("Parking Number: " + vehicle.getParkingNumber());//pemanggilan nomor parkir yang tersimpan di dalam method pada class vehicle.
                System.out.println("Plate Number: " + vehicle.getPlatNumber());//pemanggilan plat nomor yang tersimpan di dalam method pada class vehicle.
                System.out.println("Model: " + vehicle.getModel());//pemanggilan model kendaraan yang tersimpan di dalam method pada class vehicle.
                System.out.println("Total Price: " + price);
                scanner.nextLine();
                return true;
            }
        }
        System.out.println("Vehicle not found");
        return false;
    }

    //method untuk menampilkan seluruh informasi kendaraan yang parkir
    public void listParked() {
        if (listParking.isEmpty()) {
            System.out.println("Parking is empty");
        } else {
            System.out.println("List of parked vehicles:");
            for (Vehicle vehicle : listParking) {
                System.out.println("Type: " + vehicle.getType());
                System.out.println("Nama: " + vehicle.getNama());
                System.out.println("Parking Number: "+ vehicle.getParkingNumber());
                System.out.println("Plat Number: "+ vehicle.getPlatNumber());
                System.out.println("Model: "+ vehicle.getModel());
                System.out.println();
            }
        }
    }

    public void printDisplay(Scanner scanner){
            System.out.println("What you want to do?");
            System.out.println("1. Parking");
            System.out.println("2. Leave parking");
            System.out.println("3. Checking slot park");
            System.out.println("enter number: ");

            int choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1://untuk parkir kendaraan
                    System.out.println("enter vehicle type (car/bike): ");
                    String typeVehicle = scanner.nextLine();
                    if(typeVehicle.equalsIgnoreCase("car")){
                        Car car = new Car("", 0, 0, "");//membuat objek dari class Car
                        car.userInput();
                        addParking(car);
                    }else if(typeVehicle.equalsIgnoreCase("bike")){
                        Bike bike = new Bike("", 0, 0, "");// membuat objek dari class Bike
                        bike.userInput();
                        addParking(bike);
                    } else{
                        System.out.println("Invalid vehicle type");
                    }
                    break;
                case 2://untuk meninggalkan parkir
                    System.out.println("Enter parking number: ");
                    int targetParkingNumber = scanner.nextInt();
                    System.out.println("How many time: ");
                    int time = scanner.nextInt();
                    leaveParking(targetParkingNumber, time, scanner);
                    break;
                case 3://untuk menampilkan list kendaraan yang berada di dalam parkir
                    listParked();
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
    }
}
