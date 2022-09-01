package pl.trollsystems.inOK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok().body(measurementPointRepository.findAll());
    }
}
