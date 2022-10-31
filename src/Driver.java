public class Driver<D extends Transport & Competing> {
    private final String fullName;
    private D driverLicense;
    private int experienceYears;

    public Driver(String name, D transport, int experienceYears){
        this.fullName = ValidateUtil.validateString(name);
        this.experienceYears = ValidateUtil.validateInt(experienceYears);
        this.driverLicense = transport;
    }

    public String getFullName() {
        return fullName;
    }

    public D getDriverLicense() {
        return driverLicense;
    }

    public int getExperienceYears() {
        return experienceYears;
    }
    public void showWhatsHappening(){
        System.out.println("Driver "+getFullName()+" on "+driverLicense.getBrand()+" "+driverLicense.getModel()+" is participating in race\n" +
                "---------------------------------------------------");
    }
}
