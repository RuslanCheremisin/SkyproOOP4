import java.util.HashSet;
import java.util.Set;

public class SkyproOOP4 {
    public static void main(String[] args) throws NoDriverLicenseException, VehicleIsAlreadyInTheListException {

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
        DriverB kolya = new DriverB("Kolya","B", 4);
        DriverC vasya = new DriverC("Vasya","C", 4);
        DriverD fedya = new DriverD("Fedya","D", 4);
//        kolya.showWhatsHappening(paganiZonda);
//        vasya.showWhatsHappening(hino300);
//        fedya.showWhatsHappening(laz699);

        /////////////////// задание по Enum ///////////////////

//        paganiZonda.getBodyTypeName();
//        toyotaMarkII.getBodyTypeName();
//
//        laz699.getPassengerCapacityValues();
//        zhongTong.getPassengerCapacityValues();
//
//        kamazMaster.getLiftingCapacityValues();
//        volvoFH.getLiftingCapacityValues();

        //в разборе использован абстрактный метод, я сделал уникальные методы под разные типы авто, если надо - переделаю

        /////////////////// задание по коллекциям 1 /////////////

        Set<Transport> carsList = new HashSet<>();
        Set<Sponsor> sponsorsList = new HashSet<>();
        Set<Driver> driversList = new HashSet<>();
        Set<Mechanic> mechanicsList = new HashSet<>();

        driversList.add(fedya);
        driversList.add(kolya);
        driversList.add(vasya);

        driversList.add(vasya); //!!!!!! duplication

        carsList.add(paganiZonda);

        carsList.add(paganiZonda); //!!!!!!!! duplication
        carsList.add(toyotaMarkII);
        carsList.add(VAZ2102);
        carsList.add(shelbyCobra);
        carsList.add(ikarus250);
        carsList.add(zhongTong);
        carsList.add(laz699);
        carsList.add(hyundaiAero);
        carsList.add(freightLinerCascadia);
        carsList.add(kamazMaster);
        carsList.add(hino300);
        carsList.add(volvoFH);


        Sponsor rosneft = new Sponsor("Rosneft");
        rosneft.addVehicle(laz699);



        rosneft.provideSupportToVehicle(laz699,20000);
        rosneft.provideSupportToVehicle(kamazMaster,700000);
        rosneft.getSponsoredVehiclesList();

        Sponsor redBull = new Sponsor<>("Red Bull");



        sponsorsList.add(rosneft);

        sponsorsList.add(rosneft); //!!!!!!!! duplication
        sponsorsList.add(redBull);

        Mechanic<Truck> stepanych = new Mechanic<>("Semyon Stepanovych", "Garazh Stepanycha");
        Mechanic<Car> dougDeMuro = new Mechanic<>("Doug DeMuro", "DeMuro YouTube Chanel");
        Mechanic<Transport> jamesHammond = new Mechanic<>("James Hammond", "Top Gear");


        mechanicsList.add(stepanych);
        mechanicsList.add(dougDeMuro);

        mechanicsList.add(dougDeMuro); //!!!!!!!! duplication
        mechanicsList.add(jamesHammond);


        laz699.getContractedMechanics().add(jamesHammond);
        hino300.getContractedMechanics().add(stepanych);

        hino300.getContractedMechanics().add(stepanych); //!!!!!!!! duplication

        stepanych.getTransportInService().add(kamazMaster);

        stepanych.getTransportInService().add(kamazMaster); //!!!!!!!! duplication
        stepanych.getTransportInService().add(freightLinerCascadia);
        stepanych.doService(kamazMaster);
        stepanych.doRepair(kamazMaster);
        stepanych.doService(freightLinerCascadia);
        stepanych.doRepair(freightLinerCascadia);
        stepanych.doService(hino300);
        stepanych.doRepair(hino300);

        paganiZonda.setDriver(fedya);

        rosneft.addVehicle(paganiZonda);
//        rosneft.addVehicle(paganiZonda);//!!!!!!!! duplication with Exception throw

        redBull.addVehicle(paganiZonda);
        paganiZonda.getContractedSponsors().add(rosneft);
        paganiZonda.getContractedSponsors().add(redBull);
        rosneft.provideSupportToVehicle(paganiZonda, 1090500);
        redBull.provideSupportToVehicle(paganiZonda, 1580000);
        paganiZonda.getContractedMechanics().add(jamesHammond);

        paganiZonda.getContractedMechanics().add(jamesHammond);//!!!!!!!! duplication
        paganiZonda.getContractedMechanics().add(dougDeMuro);
        DetailedInfo.getDetailedInfo(paganiZonda);


        kamazMaster.setDriver(vasya);
        kamazMaster.getContractedSponsors().add(rosneft);

        kamazMaster.getContractedSponsors().add(rosneft);//!!!!!!!! duplication
        rosneft.addVehicle(kamazMaster);
        rosneft.provideSupportToVehicle(kamazMaster, 258000);
        kamazMaster.getContractedMechanics().add(stepanych);
        DetailedInfo.getDetailedInfo(kamazMaster);
        DetailedInfo.getDetailedInfo(paganiZonda);

        /////////////////// задание по коллекциям 2 /////////////

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addTransport(kamazMaster);
        serviceStation.serviceVehicles();
    }

}
