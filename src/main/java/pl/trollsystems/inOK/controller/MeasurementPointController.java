package pl.trollsystems.inOK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.trollsystems.inOK.repository.MeasurementPointRepository;

@RestController
@RequestMapping("/measurement-points")
public class MeasurementPointController {
    private MeasurementPointRepository measurementPointRepository;

    @Autowired
    public MeasurementPointController(MeasurementPointRepository measurementPointRepository) {
        this.measurementPointRepository = measurementPointRepository;
    }
}
