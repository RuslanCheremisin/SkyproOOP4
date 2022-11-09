public class DriverD extends Driver<Bus>{
    public DriverD(String name, String driverLicense, int experience)throws NoDriverLicenseException{
        super(name, driverLicense, experience);
        if (driverLicense== null || driverLicense!="D"){
            throw new NoDriverLicenseException("No driver license!");
        }
    }
}
