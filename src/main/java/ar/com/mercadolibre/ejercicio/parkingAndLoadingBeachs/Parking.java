package ar.com.mercadolibre.ejercicio.parkingAndLoadingBeachs;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    private List<Vehicle> vehicles;

    private static Parking instance = new Parking();

    private Parking() {
        vehicles = new ArrayList<Vehicle>();
    }

    public static Parking getInstance() {
        return instance;
    }

    public Integer getBusyPlaces() {
        return vehicles.size();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

}
