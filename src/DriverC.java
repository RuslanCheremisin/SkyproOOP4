public class DriverC extends Driver<Truck>{
    Truck truck;
    public DriverC(String name, char driverLicense, int experienceYears) {
        super(name, driverLicense, experienceYears);
        if (driverLicense!='C'){
            setDriverLicense('C');
        }
    }
}
