package peaksoft.dto;

import peaksoft.enums.State;
import peaksoft.models.Driver;

/**
 * @author Beksultan
 */
public class TruckDto {
    private int id;
    private String name;
    private Driver driver;
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
