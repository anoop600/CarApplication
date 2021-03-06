package com.mindtree.carapp.service;

import java.util.List;

import com.mindtree.carapp.entity.Car;
import com.mindtree.carapp.exception.ServiceException;

public interface CarService {
	
	public String addCar(Car car) throws ServiceException;

	public List<Car> getAllCars() throws ServiceException;
}
