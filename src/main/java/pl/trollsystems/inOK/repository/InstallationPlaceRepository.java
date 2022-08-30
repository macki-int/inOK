package pl.trollsystems.inOK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.trollsystems.inOK.model.InstallationPlace;

@Repository
public interface InstallationPlaceRepository extends JpaRepository<InstallationPlace, Long> {
}
