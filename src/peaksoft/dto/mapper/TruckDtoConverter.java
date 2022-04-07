package peaksoft.dto.mapper;

import com.google.common.base.Converter;
import peaksoft.dto.TruckDto;
import peaksoft.enums.State;
import peaksoft.models.Truck;

/**
 * @author Beksultan
 */
public class TruckDtoConverter extends Converter<TruckDto, Truck> {
    @Override
    protected Truck doForward(TruckDto truckDto) {
        Truck truck = new Truck();
        truck.setId(truckDto.getId());
        truck.setName(truckDto.getName());
        truck.setDriver(truckDto.getDriver());
        truck.setState(switch (truckDto.getState()) {
            case "base" -> State.ON_BASE;
            case "road" -> State.ON_THE_ROAD;
            case "repair" -> State.ON_REPAIR;
            default -> throw new IllegalStateException(
                    "invalid state"
            );
        });
        return truck;
    }

    @Override
    protected TruckDto doBackward(Truck truck) {
        return null;
    }
}
