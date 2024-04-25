import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Parking parking = new Parking();
        Scanner scanner = new Scanner(System.in);

        while(true){
            parking.printDisplay(scanner);
            System.out.println("Do you want to continue  (yes/no)?");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("yes")){
                break;
            }
        }
        scanner.close();
    }
}
