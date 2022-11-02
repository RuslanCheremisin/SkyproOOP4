import java.util.Arrays;
import java.util.WeakHashMap;

public class SkyproOOP4 {
    public static void main(String[] args) {

        Car paganiZonda = new Car("Pagani", "Zonda",6.0, Car.BodyType.COUPE);
        Car toyotaMarkII = new Car("Toyota", "Mark II",2.5, null);
        Car VAZ2102 = new Car("VAZ", "2102",1.3, Car.BodyType.WAGON);
        Car shelbyCobra = new Car("Shelby", "Cobra",4.7, Car.BodyType.COUPE);

        Bus ikarus250 = new Bus("Ikarus", "250", 5.0, Bus.PassengerCapacity.M);
        Bus zhongTong = new Bus("Zhong Tong", "Cruise 6107H", 5.5, null);
        Bus laz699 = new Bus("LAZ", "699A", 5.0, Bus.PassengerCapacity.S);
        Bus hyundaiAero = new Bus("Hyundai", "Aero", 7.0, Bus.PassengerCapacity.M);

        Truck kamazMaster = new Truck("KAMaZ", "Master", 12.98, Truck.LiftingCapacity.N2);
        Truck hino300 = new Truck("Hino", "300", 4.0, Truck.LiftingCapacity.N1);
        Truck freightLinerCascadia = new Truck("FreightLiner", "Cascadia", 12.8, Truck.LiftingCapacity.N3);
        Truck volvoFH = new Truck("Volvo", "FH", 12.1, null);

//        toyotaMarkII.getBestLapTime();
//        ikarus250.doPitStop();
//        hino300.getMaxSpeed();

//
        DriverB kolya = new DriverB("Kolya",'C', 4);
        DriverC vasya = new DriverC("Vasya",'B', 4);
        DriverD fedya = new DriverD("Fedya",'D', 4);
//        kolya.showWhatsHappening(paganiZonda);
//        vasya.showWhatsHappening(hino300);
//        fedya.showWhatsHappening(laz699);

        /////////////////// задание по Enum ///////////////////

        paganiZonda.getBodyTypeName();
        toyotaMarkII.getBodyTypeName();

        laz699.getPassengerCapacityValues();
        zhongTong.getPassengerCapacityValues();

        kamazMaster.getLiftingCapacityValues();
        volvoFH.getLiftingCapacityValues();



    }

}
