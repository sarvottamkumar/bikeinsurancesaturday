package com.bikeinsuranceapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikeinsuranceapp.model.Bike;
import com.bikeinsuranceapp.service.IBikeService;


@RestController
public class BikeController {

	@Autowired
	IBikeService bikeService;

	@GetMapping("/bikes")
	public void addBike(@RequestBody Bike bike) {
		bikeService.addBike(bike);
	}
	@PutMapping("/bikes")
	public void updateBike(@RequestBody Bike bike) {
		bikeService.updateBike(bike);
	}
	@DeleteMapping("/bikes/{bikeId}")
	public void deleteBike(@PathVariable("bikeId")int  bikeId) {
		bikeService.deleteBike(bikeId);
	}
	
	@GetMapping("/bikes/type/{type}")
	public List<Bike> getByType(@PathVariable("type") String type){
		return bikeService.getByType(type);
	} 
	
	@GetMapping("/bikes/bikeName/{bikeName}/brand/{brand}")
	public List<Bike> getByBikeNameAndBrand
			(@PathVariable("bikeName") String bikeName, @PathVariable("brand") String brand ) {
		
		return bikeService.getByBikeNameAndBrand(bikeName, brand);
	}

	
	@GetMapping("/bikes/ownerName/{ownerName}")
	public List<Bike> getByBikeOwnerName(@PathVariable("ownerName") String ownerName){
		return bikeService.getByType(ownerName);
	}
	
//	http://localhost:8080/investments
	@GetMapping("/bikes")
	public List<Bike> getAll(){
		return bikeService.getAll();
	}
	
	@GetMapping("/bikes/bikeId/{bikeId}")
	public Bike getById(@PathVariable("bikeId") int bikeId) {
		return bikeService.getById(bikeId);
	
}

}
