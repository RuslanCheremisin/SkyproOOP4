public class Bus extends Transport{
    public Bus(String brand, String model, double engineDisplacement){
        super(brand, model, engineDisplacement);
    }

    @Override
    public void startMovement() {
        System.out.println("Bus "+getBrand()+" "+getModel()+" starts moving" +
                "\n---------------------------------------------------");


    }
    @Override
    public void stopMovement(){
        System.out.println("Bus "+getBrand()+" "+getModel()+" stops" +
                "\n---------------------------------------------------");

    }
    @Override
    public void doPitStop() {
        System.out.println("Bus "+getBrand()+" "+getModel()+" goes to pit lane" +
                "\n---------------------------------------------------");

    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Bus "+getBrand()+" "+getModel()+" drives at MAXIMUM SPEED!!!" +
                "\n---------------------------------------------------");

    }

    @Override
    public void getBestLapTime() {
        System.out.println("Bus "+getBrand()+" "+getModel()+" shows best lap time!");

    }
}
