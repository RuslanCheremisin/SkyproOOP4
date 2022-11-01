import java.util.Arrays;

public class SkyproOOP4 {
    public static void main(String[] args) {

        Car paganiZonda = new Car("Pagani", "Zonda",6.0);
        Car toyotaMarkII = new Car("Toyota", "Mark II",2.5);
        Car VAZ2102 = new Car("VAZ", "2102",1.3);
        Car shelbyCobra = new Car("Shelby", "Cobra",4.7);

        Bus ikarus250 = new Bus("Ikarus", "250", 5.0);
        Bus zhongTong = new Bus("Zhong Tong", "Cruise 6107H", 5.5);
        Bus laz699 = new Bus("LAZ", "699A", 5.0);
        Bus hyundaiAero = new Bus("Hyundai", "Aero", 7.0);

        Truck kamazMaster = new Truck("KAMaZ", "Master", 12.98);
        Truck hino300 = new Truck("Hino", "300", 4.0);
        Truck freightLinerCascadia = new Truck("FreightLiner", "Cascadia", 12.8);
        Truck volvoFH = new Truck("Volvo", "FH", 12.1);

//        toyotaMarkII.getBestLapTime();
//        ikarus250.doPitStop();
//        hino300.getMaxSpeed();

//
        DriverB kolya = new DriverB("Kolya",'C', 4);
        DriverC vasya = new DriverC("Vasya",'B', 4);
        DriverD fedya = new DriverD("Fedya",'D', 4);
        kolya.showWhatsHappening(paganiZonda);
        vasya.showWhatsHappening(kamazMaster);
        fedya.showWhatsHappening(laz699);

    }

}
