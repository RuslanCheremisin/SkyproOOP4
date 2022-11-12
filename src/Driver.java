import java.util.Objects;

public class Driver<D extends Transport & Competing> {
    private final String fullName;
    private String driverLicense;
    private int experienceYears;


    public Driver(String fullName, String driverLicense, int experienceYears) throws NoDriverLicenseException {
        this.fullName = ValidateUtil.validateString(fullName);
        this.driverLicense = ValidateUtil.validateString(driverLicense);
        this.experienceYears = ValidateUtil.validateInt(experienceYears);
    }

    public String getFullName() {
        return fullName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) throws NoDriverLicenseException {
        this.driverLicense = ValidateUtil.validateString(driverLicense);
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public Transport getDriversTransportInfo(D d) {
        return d;
    }

    public void showWhatsHappening(D d) {
        System.out.println("Driver " + getFullName() + " on " + d.getBrand() + " " + d.getModel() + " is participating in race\n" +
                "---------------------------------------------------");
    }

    @Override
    public int hashCode(){
        return Objects.hash(fullName, driverLicense, experienceYears);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o==null || this.getClass()!=o.getClass()){
            return false;
        }
        Driver driver = (Driver) o;
        return Objects.equals(driver.fullName, fullName) && Objects.equals(driver.driverLicense, driverLicense) && driver.experienceYears==experienceYears;
    }


}
