package com.nish.servicemanager.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nish.servicemanager.bo.VehicleRegistrationBO;
import com.nish.servicemanager.contract.VehicleRegistrationContract;
import com.nish.servicemanager.service.VehicleRegistrationService;
@RestController
@RequestMapping(path ="/api")
public class VehicleRegistrationController implements VehicleRegistrationContract {
	@Autowired
	private VehicleRegistrationService vehicleRegistrationService;
	@RequestMapping(
			path = "/registration",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	@Override
	public ResponseEntity<String> registerVehicle(@Valid @RequestBody VehicleRegistrationBO vehicleRegistrationBO) {
		vehicleRegistrationService.registerVehicleDetails(vehicleRegistrationBO);
		return ResponseEntity.ok().build();
	}

}
