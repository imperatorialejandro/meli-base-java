package ar.com.mercadolibre.ejercicio.parkingAndLoadingBeachs;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ParkingTest {

    Parking parking;

    @Before
    public void beforeExecution() {
        parking = Parking.getInstance();
    }

    @Test
    public void seCreaPlayaEstacionamientoVacia() {
        // Integer busyPlaces = parking.getBusyPlaces();

        Assertions.assertThat(parking).isNotNull();
        // Assertions.assertThat(busyPlaces).isEqualTo(0);
    }

    @Test
    public void seAgregaAutoEnPlayaEstacionamiento() {
        Vehicle car = new Car();
        parking.addVehicle(car);
        Integer busyPlaces = parking.getBusyPlaces();

        Assertions.assertThat(busyPlaces).isEqualTo(1);
    }

    @Test
    public void seAgregaOtroVehiculoEnPlayaEstacionamiento() {
        Vehicle van = new Van();
        parking.addVehicle(van);
        Integer busyPlaces = parking.getBusyPlaces();

        Assertions.assertThat(busyPlaces).isEqualTo(2);
    }

}
