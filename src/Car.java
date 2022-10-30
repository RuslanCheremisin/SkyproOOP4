public class Car extends Transport{

    public Car(String brand, String model, double engineDisplacement){
        super(brand, model, engineDisplacement);
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


}
