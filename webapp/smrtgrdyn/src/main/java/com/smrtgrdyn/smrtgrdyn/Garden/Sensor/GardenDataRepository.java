package com.smrtgrdyn.smrtgrdyn.Garden.Sensor;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Optional;

/* GardenSensorDataId is a Composite ID class used for this repository
* This allows a single garden to have multiple entries
* And allows multiple entries at the same time without loss
* of specification*/

@Repository
public interface GardenDataRepository extends CrudRepository<GardenSensorData, GardenSensorDataId> {

    @Query(value = "SELECT * FROM garden_sensor_data" +
            " where timestamp = :timestamp",
            nativeQuery = true) //native query means to use native SQL
    Optional<GardenSensorData> selectCustomerByTimestamp(@Param("timestamp") Timestamp timestamp);
}