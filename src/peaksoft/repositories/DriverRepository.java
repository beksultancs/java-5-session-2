package peaksoft.repositories;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import peaksoft.exceptions.JsonFileNotFoundException;
import peaksoft.models.Driver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Beksultan
 */
public class DriverRepository {

    private static Map<Integer, Driver> driverMap =
            new HashMap<>();

    static {
        Gson gson = new Gson();
        JsonReader jsonReader = null;
        try {
            jsonReader = new JsonReader(
                    new FileReader("resources/drivers.json")
            );
        } catch (FileNotFoundException e) {
            throw new JsonFileNotFoundException(
                    "drivers.json does not exists"
            );
        }
        Driver[] drivers = gson.fromJson(jsonReader, Driver[].class);
        for (Driver driver : drivers) {
            driverMap.put(driver.getId(), driver);
        }
    }

    public List<Driver> getAllDrivers() {
        return driverMap.values().stream().toList();
    }
}
