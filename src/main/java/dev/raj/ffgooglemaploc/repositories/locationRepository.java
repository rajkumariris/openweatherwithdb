package dev.raj.ffgooglemaploc.repositories;

import dev.raj.ffgooglemaploc.models.locationinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface locationRepository extends JpaRepository<locationinfo, Long> {

    locationinfo save(locationinfo info);
}
