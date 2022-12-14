package pl.trollsystems.inOK.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "installation_places")
public class InstallationPlace {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String placeName;
    private String description;
    private String localizationGPS;
    private LocalDate startMeasurement;
    private LocalDate stopMeasurement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocalizationGPS() {
        return localizationGPS;
    }

    public void setLocalizationGPS(String localizationGPS) {
        this.localizationGPS = localizationGPS;
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
}
