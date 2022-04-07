package peaksoft.services;

import peaksoft.models.Truck;
import peaksoft.repositories.TruckRepository;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * @author Beksultan
 */
public class TruckService {

    private TruckRepository truckRepository;

    public TruckService() throws FileNotFoundException {
        truckRepository = new TruckRepository();
    }

    public List<Truck> findAllTrucks() {
        return truckRepository.getAllTrucks();
    }
}
