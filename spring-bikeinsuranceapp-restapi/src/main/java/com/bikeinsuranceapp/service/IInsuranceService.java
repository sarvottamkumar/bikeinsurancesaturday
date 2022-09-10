package com.bikeinsuranceapp.service;

import java.util.List;

import com.bikeinsuranceapp.model.Bike;
import com.bikeinsuranceapp.model.Insurance;

public interface IInsuranceService {
	
	void addInsurance(Insurance insurance);
	void updateInsurance(Insurance insurance);
	void deleteInsurance(int insuranceId);
	
	List<Insurance> getAll();
	List<Insurance> getByPlanType(String type);
	Bike getInsuranceById(int insuranceId);

}
