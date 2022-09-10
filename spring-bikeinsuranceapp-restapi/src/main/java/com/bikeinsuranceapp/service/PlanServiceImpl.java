package com.bikeinsuranceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikeinsuranceapp.model.Plan;
import com.bikeinsuranceapp.repository.IPlanRepository;

@Service
public class PlanServiceImpl implements IPlanService{
	
	@Autowired
	IPlanRepository planRepository;

	@Override
	public List<Plan> getAll() {
		// TODO Auto-generated method stub
		return planRepository.findAll();
	}

}
