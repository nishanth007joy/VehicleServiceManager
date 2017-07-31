package com.nish.servicemanager.contract;

import static org.assertj.core.api.Assertions.registerCustomDateFormat;

import org.springframework.http.ResponseEntity;

import com.nish.servicemanager.bo.VehicleRegistrationBO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api()
public interface VehicleRegistrationContract {
	@ApiOperation(value ="Register Vehicle details")
	@ApiResponses(
			value = {
					@ApiResponse(code = 200, message = "Success"),
					@ApiResponse(code = 400, message = "Bad request"),
					@ApiResponse(code = 401, message = "Request was not authorised"),
					@ApiResponse(code = 500, message = "Service is experiencing problems.")
			}
			)
	public ResponseEntity<String> registerVehicle(@ApiParam(value ="", required = true ) VehicleRegistrationBO vehicleRegistrationBO);
}
