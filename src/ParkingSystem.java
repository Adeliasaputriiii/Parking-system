import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParkingSystem{
    private Random random;
    private List<Integer> parkingNumbers;

    public ParkingSystem(){
        this.random = new Random();
        this.parkingNumbers = new ArrayList<>();
    }

    //method untuk menghasilkan nilai random yang akan diinisialisasi sebagai parking number
    public int generateParkingNumber(){
        int parkingNumber = random.nextInt(90) + 1;
        parkingNumbers.add(parkingNumber);
        return parkingNumber;
    }
}
