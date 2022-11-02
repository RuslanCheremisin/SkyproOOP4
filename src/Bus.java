public class Bus extends Transport{

    public enum PassengerCapacity{
        XS(0,10),
        S(0,25),
        M(40,50),
        L(60,80),
        XL(100,120);

        int minMaxPassengerCapacity;
        int maxMaxPassengerCapacity;

        PassengerCapacity(int minMaxPassengerCapacity, int maxMaxPassengerCapacity){
            this.minMaxPassengerCapacity = minMaxPassengerCapacity;
            this.maxMaxPassengerCapacity = maxMaxPassengerCapacity;
        }

        public String getPassengerCapacityValues() {
            if (minMaxPassengerCapacity == 0) {
                return "Max capacity is up to " + maxMaxPassengerCapacity+" passengers";
            } else {
                return "Max capacity is from " + minMaxPassengerCapacity + " to " + maxMaxPassengerCapacity+" passengers";
            }
        }

    }
    PassengerCapacity passengerCapacity;
    public Bus(String brand, String model, double engineDisplacement, PassengerCapacity passengerCapacity){
        super(brand, model, engineDisplacement);
        this.passengerCapacity = passengerCapacity;
    }

    public void getPassengerCapacityValues(){
        if (passengerCapacity != null) {
            System.out.println("Bus "+getBrand()+" "+getModel()+", "+passengerCapacity.getPassengerCapacityValues());
        } else {
            System.out.println("Not enough data");
        }
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
