public class Car extends Transport{
    public enum BodyType{
        SEDAN("Sedan"),
        HATCHBACK("Hatchback"),
        COUPE("Coupe"),
        WAGON("Wagon"),
        OFFROAD("Off-Road"),
        CROSSOVER("Crossover"),
        PICKUP("Pickup"),
        VAN("Van"),
        MINIVAN("Mini-Van");
        private final String bodyTypeName;
        BodyType(String bodyTypeName){
            this.bodyTypeName = bodyTypeName;
        }
        public String getBodyTypeName(){
            return bodyTypeName;
        }
    }
       private final BodyType bodyType;


    public Car(String brand, String model, double engineDisplacement, BodyType bodyType){
        super(brand, model, engineDisplacement);
        this.bodyType = bodyType;
    }

    @Override
    public void startMovement() {
        System.out.println("Car "+getBrand()+" "+getModel()+" starts moving" +
                "\n---------------------------------------------------");
    }
    @Override
    public void stopMovement(){
        System.out.println("Car "+getBrand()+" "+getModel()+" stops" +
                "\n---------------------------------------------------");
    }

    @Override
    public void doPitStop() {
        System.out.println("Car "+getBrand()+" "+getModel()+" goes to pit lane" +
                "\n---------------------------------------------------");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Car "+getBrand()+" "+getModel()+" drives at MAXIMUM SPEED!!!" +
                "\n---------------------------------------------------");
    }

    @Override
    public void getBestLapTime() {
        System.out.println("Car "+getBrand()+" "+getModel()+" shows best lap time!\n" +
                "---------------------------------------------------");
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void getBodyTypeName() {
        if (bodyType != null) {
            System.out.println(getBrand()+" "+getModel()+" is a "+bodyType.getBodyTypeName());
        } else {
            System.out.println("Not enough data");
        }

    }
}
