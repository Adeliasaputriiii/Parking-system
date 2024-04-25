import java.util.Scanner;

public class Bike extends Vehicle {
    public Bike(String Nama, int parkingNumber, int platNumber, String model){
        super(Nama, parkingNumber, platNumber, model);
        this.typeVehicle = "Bike";
    }

    //override method
    @Override
    public double getPrice(){
        return 3000;
    }

    //method ini akan dipanggil ketika user ingin parkir kendaraan bike
    public void userInput(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Driver Name:");
        String inputNama = scanner.nextLine();
        System.out.println("Bike Model (sport/touring/off-road): ");
        String inputModel = scanner.nextLine();
        this.Nama = inputNama;
        this.model = inputModel;
    }
}
