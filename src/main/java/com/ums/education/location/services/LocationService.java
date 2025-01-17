package com.ums.education.location.services;

import java.util.List;

import com.ums.education.location.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(Long id);

	List<Location> getAllLocations();
}
