package com.mindtree.carapp.dao;

import java.util.List;

import com.mindtree.carapp.entity.Car;
import com.mindtree.carapp.exception.DaoException;

public interface CarDao {

	public int insert(Car car) throws DaoException;

	public List<Car> displayCar() throws DaoException;

}
