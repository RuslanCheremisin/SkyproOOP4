import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Mechanic <M extends Transport>{

    private String fullName;
    private String companyName;

    private Set<Transport> transportInService = new HashSet<>();



    public Mechanic(String fullName, String companyName) {
        setFullName(fullName);
        setCompanyName(fullName);
    }

    public void doService(M m) {
        if (transportInService.contains(m)){
            System.out.println("Ok, "+m.getBrand()+" "+m.getModel()+" is in my contract, let's have a look");
            if (m.service() == true ) {
                System.out.println(m.getBrand()+" "+m.getModel()+", service is done"+"\n" +
                        "---------------------------------------------------");
            }else {
                System.out.println("Impossible to do service on this "+m.getBrand()+" "+m.getModel()+": complex repair is required"+"\n" +
                        "---------------------------------------------------");
                m.setCarMustBeFixed();
            }
        }else{
            System.out.println("I don't have "+m.getBrand()+" "+m.getModel()+" in my contract. Find another mechanic\n"+"-------------------------------------");
        }

    }

//    public void repair(M m){
//        if (m instanceof Bus) {
//            System.out.println("I don't work with buses");
//        }else{
//            System.out.println("OK, I will repair "+m.getBrand()+" "m.getModel());
//        }
//    }
    public void doRepair(M m){

        if (getTransportInService().contains(m)) {

            if (m.canCarBeFixed() == true) {
                System.out.println("I'm fixing it");
                m.carIsFixed();
                System.out.println(m.getBrand()+" "+m.getModel()+" is fixed, lets swing a drink!"+"\n" +
                        "---------------------------------------------------");
            }else {
                System.out.println("There's nothing to fix, "+m.getBrand()+" "+m.getModel()+" flies like LASTOCHKA!"+"\n" +
                        "---------------------------------------------------");
            }
        }else {
            System.out.println("I don't have "+m.getBrand()+" "+m.getModel()+" in my contract. Find another mechanic\n"+"-------------------------------------");
        }
    }

    private void setFullName(String fullName) {
        this.fullName = ValidateUtil.validateString(fullName);
    }
    private void setCompanyName(String companyName) {
        this.companyName = ValidateUtil.validateString(companyName);
    }

    public Set<Transport> getTransportInService() {
        return transportInService;
    }


    public String getFullname() {
        return fullName;
    }
    @Override
    public int hashCode(){
        return Objects.hash(fullName, companyName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o==null || this.getClass()!=o.getClass()){
            return false;
        }
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(mechanic.fullName, fullName) && Objects.equals(mechanic.companyName, companyName) ;
    }
}
