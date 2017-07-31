package com.nish.servicemanager.service;

import com.nish.servicemanager.bo.VehicleRegistrationBO;
/**
 * Service class for all methods dealing with vehicle registration.
 * @author Nishanth Mathew Joy
 *
 */
public interface VehicleRegistrationService {
	/**
	 * Method dealing with registration of vehicle details
	 * @param vehicleRegistrationBO
	 * @return
	 */
	public boolean registerVehicleDetails(VehicleRegistrationBO vehicleRegistrationBO);
}
