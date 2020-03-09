package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.CarMapper;
import com.example.demo.model.Car;

@RestController
@RequestMapping("/rest/car")
public class CarController {

	private CarMapper carMapper;

	public CarController(CarMapper carMapper) {
		this.carMapper = carMapper;
	}

	@GetMapping("/all")
	public List<Car> getAll() {
		return carMapper.findAll();
	}

	@GetMapping("/insert")
	public List<Car> insertCar() {
		List<Car> cars = Arrays.asList(
				new Car("KIA", "Moring", "good"),
				new Car("Honda", "Cub79", "very good"),
				new Car("Huyndai", "Hello", "nice"),
				new Car("BMW", "Lotus", "bad")
		);
		cars.forEach(carMapper::insert);

		return carMapper.findAll();
	}
	
	@GetMapping("/delete")
	public List<Car> deleteCarByid() {
		carMapper.deleteById(4);
		return carMapper.findAll();
	}
	
	@GetMapping("/search")
	public List<Car> searchCar(){
		return carMapper.search("Honda",null,null);
	}
}
