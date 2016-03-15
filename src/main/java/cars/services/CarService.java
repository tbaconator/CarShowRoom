package cars.services;

import java.util.List;

import cars.entities.Car;

public interface CarService {

	/**
	 * Adds new item to Car
	 * 
	 * @param Car
	 * @return
	 */
	void add(Car Car);

	/**
	 * Retrieves all items from Car
	 * 
	 * @return
	 */
	List<Car> getCars();

	/**
	 * Update information on existing Car.
	 * 
	 * @param Car
	 */

	void update(Car Car);

	/**
	 * Retrieves Car information
	 * 
	 * @param CarId
	 * @return
	 */
	Car getCarById(Integer CarId);

}
