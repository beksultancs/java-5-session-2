package peaksoft.services;

import peaksoft.models.Driver;
import peaksoft.repositories.DriverRepository;

import java.util.List;

/**
 * @author Beksultan
 */
public class DriverService {

    private DriverRepository driverRepository = new DriverRepository();

    public List<Driver> findAllDrivers() {
        return driverRepository.getAllDrivers();
    }
}
