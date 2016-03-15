package cars.services;

import java.util.List;

import cars.entities.CarColor;

public interface ColorService {

	/**
	 * Adds new item to CarColor
	 * 
	 * @param CarColor
	 * @return
	 */
	void add(CarColor carColor);

	/**
	 * Retrieves all items from CarColor
	 * 
	 * @return
	 */
	List<CarColor> getCategories();

	/**
	 * Update information on existing CarColor.
	 * 
	 * @param CarColor
	 */

	void update(CarColor carColor);

	/**
	 * Retrieves CarColor information
	 * 
	 * @param CarColorId
	 * @return
	 */
	CarColor getCarColorById(Integer carColorId);

}
