package pl.trollsystems.inOK.model;

import javax.persistence.*;

@Entity
@Table(name="inclinometers")
public class Inclinometer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer speedTransmission;
    private Integer length;
    @ManyToOne
    @JoinColumn(name = "mkg_device_id")
    private MkgDevice mkgDevice;

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

    public Integer getSpeedTransmission() {
        return speedTransmission;
    }

    public void setSpeedTransmission(Integer speedTransmission) {
        this.speedTransmission = speedTransmission;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public MkgDevice getMkgDevice() {
        return mkgDevice;
    }

    public void setMkgDevice(MkgDevice mkgDevice) {
        this.mkgDevice = mkgDevice;
    }

}
