package pl.trollsystems.inOK.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "measurement_points")
public class MeasurementPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String localizationGPS;
    private LocalDate startMeasurement;
    private LocalDate stopMeasurement;
    @ManyToOne
    @JoinColumn(name = "installation_site_id")
    private InstallationPlace installationPlace;

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

    public InstallationPlace getInstallationSite() {
        return installationPlace;
    }

    public void setInstallationSite(InstallationPlace installationPlace) {
        this.installationPlace = installationPlace;
    }

}
