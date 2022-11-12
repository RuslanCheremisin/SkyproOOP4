public class DetailedInfo {
    public static void getDetailedInfo(Transport transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel());
        System.out.println("Driver: " + transport.getDriver().getFullName());
        System.out.println("List of sponsors:");
        for (Sponsor sponsor: transport.getContractedSponsors()) {
            System.out.println(sponsor.getName()+" with support amount of "+sponsor.getSupportAmount());
        }
        System.out.println("List of mechanics:");
        for (Mechanic mechanic: transport.getContractedMechanics()) {
            System.out.println(mechanic.getFullname());
        }
        System.out.println("---------------------------------------------------------");

    }
}
