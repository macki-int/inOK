package pl.trollsystems.inOK.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "mkg_devices")
public class MkgDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private LocalDate startMeasurement;
    private LocalDate stopMeasurement;
    @ManyToOne
    @JoinColumn(name = "measurement_point_id")
    private MeasurementPoint measurementPoint;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartMeasurement() {
        return startMeasurement;
    }

    public void setStartMeasurement(LocalDate startMeasurement) {
        this.startMeasurement = startMeasurement;
    }

    public LocalDate getStopMeasurement() {
        return stopMeasurement;
    }

    public void setStopMeasurement(LocalDate stopMeasurement) {
        this.stopMeasurement = stopMeasurement;
    }

    public MeasurementPoint getMeasurementPoint() {
        return measurementPoint;
    }

    public void setMeasurementPoint(MeasurementPoint measurementPoint) {
        this.measurementPoint = measurementPoint;
    }
}
