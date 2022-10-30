public abstract class Transport implements Competing{
    private final String brand;
    private final String model;
    private final double engineDisplacement;


    public Transport(String brand, String model, double engineDisplacement){
        this.brand = ValidateUtil.validateString(brand);
        this.model = ValidateUtil.validateString(model);
        this.engineDisplacement = ValidateUtil.validateDouble(engineDisplacement);

    }

    public abstract void startMovement();
    public abstract void stopMovement();

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public double getEngineDisplacement(){
        return engineDisplacement;

    }



}
