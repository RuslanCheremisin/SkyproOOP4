public class Driver<D extends Transport & Competing> {
    private final String fullName;
    private char driverLicense;
    private int experienceYears;

    public Driver(String name, char driverLicense, int experienceYears){
        this.fullName = ValidateUtil.validateString(name);
        this.driverLicense = ValidateUtil.validateChar(driverLicense);
        this.experienceYears = ValidateUtil.validateInt(experienceYears);
    }

    public String getFullName() {
        return fullName;
    }

    public char getDriverLicense() {
        return driverLicense;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
    public void showWhatsHappening(D d){
        System.out.println("Driver "+getFullName()+" on "+d.getBrand()+" "+d.getModel()+" is participating in race\n" +
                "---------------------------------------------------");
    }
}
