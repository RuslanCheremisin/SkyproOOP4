public class Truck extends Transport{

    public Truck(String brand, String model, double engineDisplacement){
        super(brand, model, engineDisplacement);
    }

    @Override
    public void startMovement() {
        System.out.println("Truck "+getBrand()+" "+getModel()+" starts moving");


    }
    @Override
    public void stopMovement(){
        System.out.println("Truck "+getBrand()+" "+getModel()+" stops");


    }
    @Override
    public void doPitStop() {
        System.out.println("Truck "+getBrand()+" "+getModel()+" goes to pit lane");

    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Truck "+getBrand()+" "+getModel()+" drives at MAXIMUM SPEED!!!" +
                "\n---------------------------------------------------");

    }

    @Override
    public void getBestLapTime() {
        System.out.println("Truck "+getBrand()+" "+getModel()+" shows best lap time!");

    }

}
