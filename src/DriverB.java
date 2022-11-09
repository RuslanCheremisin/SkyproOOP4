public class DriverB extends Driver<Car>{
    public DriverB(String name, String driverLicense, int experienceYears) throws NoDriverLicenseException{
        super(name, driverLicense, experienceYears);
        if (driverLicense== null || driverLicense!="B"){
            throw new NoDriverLicenseException("No driver license!");
        }
    }
}
