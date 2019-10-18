package com.ums.education.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ums.education.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
