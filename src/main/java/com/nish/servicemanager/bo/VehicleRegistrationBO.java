package com.nish.servicemanager.bo;

import javax.validation.constraints.NotNull;

public class VehicleRegistrationBO {
	@NotNull
	private String vehicleMake;
	@NotNull
	private String vehicleModel;
	public String getVehicleMake() {
		return vehicleMake;
	}
	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

}
