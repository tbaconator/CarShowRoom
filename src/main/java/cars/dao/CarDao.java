package cars.dao;

import java.util.List;

import cars.entities.Car;

public interface CarDao {

	void add(Car car);

	void update(Car car);

/*	void delete(Car car);*/

	List<Car> getAllCars();

	Car getByCarId(Integer carId);

}
