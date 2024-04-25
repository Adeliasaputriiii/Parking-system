import java.util.Scanner;


public class Car extends Vehicle {
    public Car(String Nama, int parkingNumber, int platNumber, String model){
        super(Nama, parkingNumber, platNumber, model);
        this.typeVehicle = "Car";
    }

    //override method
    @Override
    public double getPrice(){
        return 7000;
    }

    //method ini akan dipanggil ketika user ingin parkir kendaraan car
    public void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Driver Name:");
        String inputNama = scanner.nextLine();
        System.out.println("Plat Number : ");
        int inputPlatNumber = scanner.nextInt();
        scanner.nextLine();
        this.Nama = inputNama;
        this.platNumber = inputPlatNumber;
    }
}
