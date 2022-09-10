package com.bikeinsuranceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikeinsuranceapp.model.Bike;
import com.bikeinsuranceapp.model.Insurance;
import com.bikeinsuranceapp.repository.IInsuranceRepository;

@Service
public class InsuranceServiceImpl implements IInsuranceService{
	
	@Autowired
	IInsuranceRepository insuranceRepository;

	@Override
	public void addInsurance(Insurance insurance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInsurance(Insurance insurance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Bike getInsuranceById(int insuranceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Insurance> getAll() {
		// TODO Auto-generated method stub
		//return insuranceRepository.findAll();
		return null;
	}

	@Override
	public List<Insurance> getByPlanType(String type) {
		// TODO Auto-generated method stub
		//return insuranceRepository.findByPlanType(type);
		return null;
	}

	

}
