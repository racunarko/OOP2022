package hr.fer.oop;

import java.time.LocalDate;


public class Reading {
    private Integer deviceId;
    private SensorReadingValue[] sensorReadings;
    private LocalDate timestamp;


    public Reading(Integer deviceId, SensorReadingValue[] sensorReading, LocalDate timestamp) {
        this.deviceId = deviceId;
        this.sensorReadings = sensorReading;
        this.timestamp = timestamp;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public SensorReadingValue[] getSensorReadings() {
        return sensorReadings;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

}
