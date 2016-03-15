package cars.dao;

import java.util.List;

import cars.entities.CarType;

public interface TypeDao {

	void add(CarType carType);

	void update(CarType carType);

	void delete(CarType carType);

	List<CarType> getAllCarTypes();

	CarType getByCarcarTypeId(Integer carTypeId);
}
