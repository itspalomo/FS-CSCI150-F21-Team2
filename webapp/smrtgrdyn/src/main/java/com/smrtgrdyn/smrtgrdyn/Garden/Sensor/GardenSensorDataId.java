package com.smrtgrdyn.smrtgrdyn.Garden.Sensor;


import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

public class GardenSensorDataId implements Serializable {

    private UUID gardenId;
    private Timestamp timestamp;

    public GardenSensorDataId() {
    }

    public GardenSensorDataId(UUID gardenId, Timestamp timestamp) {
        this.gardenId = gardenId;
        this.timestamp = timestamp;
    }

    public UUID getGardenId() {
        return gardenId;
    }

    public void setGardenId(UUID gardenId) {
        this.gardenId = gardenId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
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
