import javax.print.attribute.IntegerSyntax;
import java.util.List;
import java.util.ArrayList;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private final double engineDisplacement;
    private boolean carMustBeFixed;

    private List<Sponsor> contractedSponsors = new ArrayList();
    private List<Mechanic> contractedMechanics = new ArrayList();

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

    public List<Sponsor> getContractedSponsors() {
        return contractedSponsors;
    }

    public List<Mechanic> getContractedMechanics() {
        return contractedMechanics;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


}
