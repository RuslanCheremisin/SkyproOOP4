public class DriverC extends Driver<Truck>{
    Truck truck;
    public DriverC(String name, String driverLicense, int experienceYears) throws NoDriverLicenseException {
        super(name, driverLicense, experienceYears);
        if (driverLicense== null || driverLicense!="C"){
            throw new NoDriverLicenseException("No driver license!");
        }
    }
}
