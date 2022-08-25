package pl.trollsystems.inOK.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.trollsystems.inOK.model.Mkg1Data;

import java.util.List;

@Repository
public interface Mkg1DataRepository extends JpaRepository<Mkg1Data, Long> {
    List<Mkg1Data> findAllByPlace(String place);
}
