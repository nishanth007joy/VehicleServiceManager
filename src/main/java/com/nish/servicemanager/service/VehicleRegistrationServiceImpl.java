package com.nish.servicemanager.service;

import org.springframework.stereotype.Service;

import com.nish.servicemanager.bo.VehicleRegistrationBO;
/**
 * Service implementation class having 
 * all business logic in registering vehicle
 * @author Nishanth Mathew Joy
 *
 */
@Service
public class VehicleRegistrationServiceImpl implements VehicleRegistrationService{

	@Override
	public boolean registerVehicleDetails(VehicleRegistrationBO vehicleRegistrationBO) {
		return true;
	}

}
