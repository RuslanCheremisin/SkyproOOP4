import java.util.HashSet;
import java.util.Set;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private final double engineDisplacement;
    private boolean carMustBeFixed;

    private Set<Sponsor> contractedSponsors = new HashSet<>();
    private Set<Mechanic> contractedMechanics = new HashSet<>();

    private Driver driver;



    public Transport(String brand, String model, double engineDisplacement) throws NoDriverLicenseException {
        this.brand = ValidateUtil.validateString(brand);
        this.model = ValidateUtil.validateString(model);
        this.engineDisplacement = ValidateUtil.validateDouble(engineDisplacement);
        if (service() == false) {
            carMustBeFixed = true;
        } else {
            carMustBeFixed = false;

        }

    }

    public abstract void startMovement();

    public abstract void stopMovement();

    public abstract boolean service();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;

    }

    void setCarMustBeFixed() {
        this.carMustBeFixed = true;
    }

    boolean canCarBeFixed() {
        return carMustBeFixed;
    }

    void carIsFixed() {
        this.carMustBeFixed = false;
    }

    public Set<Sponsor> getContractedSponsors() {
        return contractedSponsors;
    }

    public Set<Mechanic> getContractedMechanics() {
        return contractedMechanics;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


}
