package com.bikeinsuranceapp.service;

import java.util.List;

import com.bikeinsuranceapp.model.Bike;

public interface IBikeService {
	
	void addBike(Bike bike);
	void updateBike(Bike bike);
	void deleteBike(int bikeId);
	
	Bike getById(int bikeId);
	
	List<Bike> getAll();
	
	List<Bike> getByBikeNumber(String bikeNumber);
	
	//derived Queries
	List<Bike> getByBikeName(String bikeName);
	List<Bike> getByBikeOwnerName(String ownerName);
	List<Bike> getByBikeBrand(String brand);
	List<Bike> getByBikeNumberAndBikeName(String bikeNumber,String bikeName);
	List<Bike> getByBikeNumberAndBrand(String bikeNumber,String brand);
	List<Bike> getByBikeNameAndBrand(String bikeName,String brand);
	
	
	List<Bike> getByInsuranceName(String insuranceName);
	List<Bike> getByType(String type);
	List<Bike> getByTypeAndInsuranceName(String type,String insuranceName);
	//List<Bike> getByTypeAndAmount(String type,double amount);

}
