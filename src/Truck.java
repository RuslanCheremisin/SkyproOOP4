public class Truck extends Transport{

    public enum LiftingCapacity{
        N1(0, 3.5),
        N2(3.5,12),
        N3(12,Double.MAX_VALUE);

        double minMaxLiftingCapacity;
        double maxMaxLiftingCapacity;

        LiftingCapacity(double minMaxLiftingCapacity, double maxMaxLiftingCapacity){
            this.minMaxLiftingCapacity = minMaxLiftingCapacity;
            this.maxMaxLiftingCapacity = maxMaxLiftingCapacity;
        }

        public double getMinMaxLiftingCapacity() {
            return minMaxLiftingCapacity;
        }

        public double getMaxMaxLiftingCapacity() {
            return maxMaxLiftingCapacity;
        }
    }

    public Truck(String brand, String model, double engineDisplacement, LiftingCapacity liftingCapacity){
        super(brand, model, engineDisplacement);
        this.liftingCapacity = liftingCapacity;
    }

    private LiftingCapacity liftingCapacity;

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

    public LiftingCapacity getLiftingCapacity() {
        return liftingCapacity;
    }

    public void getLiftingCapacityValues(){
        if (liftingCapacity==LiftingCapacity.N1){
            System.out.println("Грузоподъёмность автомобиля "+getBrand()+" "+getModel()+" до "+liftingCapacity.getMaxMaxLiftingCapacity());
        } else if (liftingCapacity==LiftingCapacity.N2) {
            System.out.println("Грузоподъёмность автомобиля "+getBrand()+" "+getModel()+" составляет от "+liftingCapacity.getMinMaxLiftingCapacity()+" до "+liftingCapacity.getMaxMaxLiftingCapacity());
        } else if (liftingCapacity==LiftingCapacity.N3) {
            System.out.println("Грузоподъёмность автомобиля "+getBrand()+" "+getModel()+" свыше "+liftingCapacity.getMinMaxLiftingCapacity());
        }else {
            System.out.println("Not enough data");
        }
    }
}
