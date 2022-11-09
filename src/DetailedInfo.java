public class DetailedInfo {
    public static void getDetailedInfo(Transport transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel());
        System.out.println("Driver: " + transport.getDriver().getFullName());
        System.out.println("List of sponsors:");
        for (int i = 0; i < transport.getContractedSponsors().size(); i++) {
            System.out.println(transport.getContractedSponsors().get(i).getName()+" with support amount of "+transport.getContractedSponsors().get(i).getSupportAmount());
        }
        System.out.println("List of mechanics:");
        for (int i = 0; i < transport.getContractedMechanics().size(); i++) {
            System.out.println(transport.getContractedMechanics().get(i).getFullname());
        }
        System.out.println("---------------------------------------------------------");

    }
}
