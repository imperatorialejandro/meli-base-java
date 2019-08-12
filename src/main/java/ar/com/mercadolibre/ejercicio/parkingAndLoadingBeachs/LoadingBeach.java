package ar.com.mercadolibre.ejercicio.parkingAndLoadingBeachs;

import java.util.ArrayList;
import java.util.List;

public class LoadingBeach {

    private List<UtilityVehicle> vehicles;

    private static LoadingBeach instance = new LoadingBeach();

    private LoadingBeach() {
        vehicles = new ArrayList<UtilityVehicle>();
    }

    public static LoadingBeach getInstance() {
        return instance;
    }

}
