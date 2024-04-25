public class Vehicle{
    protected String Nama;
    protected int parkingNumber;
    protected String typeVehicle;
    protected int platNumber;
    protected String model;

    public Vehicle(String Nama, int parkingNumber, int platNumber, String model){
        this.Nama = Nama;
        this.parkingNumber = parkingNumber;
        this.platNumber = platNumber;
        this.model= model;
    }

    //method untuk menyimpan harga parkir 
   public double getPrice(){
    return 0;
   }

   //menyimpan jenis kendaraan
   public String getType(){
    return typeVehicle;
   }

   //menyimpan nama driver
   public String getNama(){
    return Nama;
   }

   //menyimpan kode parkir
   public int getParkingNumber(){
    return parkingNumber;
   }

   //menyimpan plat nomor kendaraan
   public int getPlatNumber(){
    return platNumber;
   }

   //menyimpan model kendaraan
   public String getModel(){
    return model;
   }
}

