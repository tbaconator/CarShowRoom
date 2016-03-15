package cars.services;

import java.util.List;

import cars.entities.CarType;

public interface TypeService {

	/**
	 * Adds new item to carType
	 * 
	 * @param carType
	 * @return
	 */
	void add(CarType carType);

	/**
	 * Retrieves all items from carType
	 * 
	 * @return
	 */
	List<CarType> getCategories();

	/**
	 * Update information on existing carType.
	 * 
	 * @param carType
	 */

	void update(CarType carType);

	/**
	 * Retrieves carType information
	 * 
	 * @param carTypeId
	 * @return
	 */
	CarType getcarTypeById(Integer carTypeId);

}
