package peaksoft;

import peaksoft.repositories.DriverRepository;
import peaksoft.services.DriverService;
import peaksoft.services.TruckService;

import java.io.FileNotFoundException;

/**
 * @author Beksultan
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        final DriverService driverService = new DriverService();
        final TruckService truckService = new TruckService();

        driverService.findAllDrivers().forEach(System.out::println);
        truckService.findAllTrucks().forEach(System.out::println);
    }
}
