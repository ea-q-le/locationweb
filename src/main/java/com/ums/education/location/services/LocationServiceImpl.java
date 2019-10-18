package com.ums.education.location.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ums.education.location.entities.Location;
import com.ums.education.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationRepo;

	@Override
	public Location saveLocation(Location location) {
		return locationRepo.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepo.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		locationRepo.delete(location);
	}

	@Override
	public Location getLocationById(Long id) {
		Optional<Location> location = locationRepo.findById(id);
		return location.get();
	}

	@Override
	public List<Location> getAllLocations() {
		return locationRepo.findAll();
	}

	public LocationRepository getLocationRepo() {
		return locationRepo;
	}

	public void setLocationRepo(LocationRepository locationRepo) {
		this.locationRepo = locationRepo;
	}

}
