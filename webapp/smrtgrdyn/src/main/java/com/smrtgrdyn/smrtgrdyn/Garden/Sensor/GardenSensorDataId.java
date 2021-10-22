package com.smrtgrdyn.smrtgrdyn.Garden.Sensor;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class GardenSensorDataId implements Serializable {

    private UUID gardenId;
    private String timestamp;

    public GardenSensorDataId() {
    }

    public GardenSensorDataId(UUID gardenId, String timestamp) {
        this.gardenId = gardenId;
        this.timestamp = timestamp;
    }

    public UUID getGardenId() {
        return gardenId;
    }

    public void setGardenId(UUID gardenId) {
        this.gardenId = gardenId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GardenSensorDataId that = (GardenSensorDataId) o;
        return gardenId.equals(that.gardenId) && timestamp.equals(that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gardenId, timestamp);
    }
}
