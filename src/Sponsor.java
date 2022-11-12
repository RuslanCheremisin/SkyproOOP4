import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sponsor<S extends Transport & List> {
    private String name;
    private int supportAmount;

    private Set<Transport> sponsoredVehicles = new HashSet<>();

    public Sponsor(String name) {
        setName(name);

    }

    public void addVehicle(Transport transport) throws VehicleIsAlreadyInTheListException {

        if (!sponsoredVehicles.contains(transport)) {
            sponsoredVehicles.add(transport);
        }else{
            throw new VehicleIsAlreadyInTheListException(transport.getBrand()+" "+transport.getModel()+" is already in the list!");

        }
    }

    public void provideSupportToVehicle(Transport transport, int supportAmount) {
        if (sponsoredVehicles.contains(transport)){
            setSupportAmount(supportAmount);


            System.out.println("Sponsor " + name + " gives " + getSupportAmount() + " to " + transport.getBrand()+" "+transport.getModel() + " for financial support");
            System.out.println("----------------------------------------");
        }else {
            System.out.println("We don't work with "+transport.getBrand()+" "+transport.getModel());
        }

    }

    public void getSponsoredVehiclesList() {
        System.out.println("Sponsored drivers list of "+getName()+":");
        for (Transport transport: sponsoredVehicles) {
            System.out.println(transport.getBrand()+" "+transport.getModel());
        }
        System.out.println("----------------------------------------");
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = ValidateUtil.validateString(name);

    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public void setSupportAmount(int supportAmount) {
        this.supportAmount = ValidateUtil.validateInt(supportAmount);
    }
}
