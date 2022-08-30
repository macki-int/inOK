package pl.trollsystems.inOK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.trollsystems.inOK.model.MeasurementPoint;

@Repository
public interface MeasurementPointRepository extends JpaRepository<MeasurementPoint, Long> {
}
