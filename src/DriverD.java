public class DriverD extends Driver<Bus>{
    public DriverD(String name, char driverLicense, int experience){
        super(name, driverLicense, experience);
        if (driverLicense!='D'){
            setDriverLicense('D');
        }
    }
}
