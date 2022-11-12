import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation<T extends Transport> {

    private Queue<T> serviceQueue = new ArrayDeque<>();

    public void addTransport(T transport) {
        if (transport instanceof Bus){
            System.out.println("Buses don't need service");
        }else {
            serviceQueue.add(transport);
        }
    }
    public void serviceVehicles(){
        T vehicle = serviceQueue.poll();
        if (vehicle != null) {
            System.out.println(vehicle.getBrand() + " " + vehicle.getModel() + " is OK, service complete.");
            serviceVehicles();
        } else {
            System.out.println("service queue is empty");
        }
    }

}
