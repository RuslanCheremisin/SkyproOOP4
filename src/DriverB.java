public class DriverB extends Driver<Car>{
    public DriverB(String name, char driverLicense, int experienceYears) {
        super(name, driverLicense, experienceYears);
        if (driverLicense!='B'){
            setDriverLicense('B');
        }
    }
}
