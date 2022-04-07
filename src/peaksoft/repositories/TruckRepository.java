package peaksoft.repositories;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import peaksoft.dto.TruckDto;
import peaksoft.dto.mapper.TruckDtoConverter;
import peaksoft.models.Truck;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Beksultan
 */
public class TruckRepository {
    private Map<Integer, Truck> truckMap = new HashMap<>();

    public TruckRepository() throws FileNotFoundException {
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(
                new FileReader("resources/trucks.json")
        );

        TruckDto[] trucks = gson.fromJson(jsonReader, TruckDto[].class);

        TruckDtoConverter truckDtoConverter = new TruckDtoConverter();

        for (TruckDto truckDto : trucks) {
            truckMap.put(truckDto.getId(), truckDtoConverter.convert(truckDto));
        }
    }

    public List<Truck> getAllTrucks() {
        return truckMap.values().stream().toList();
    }
}
