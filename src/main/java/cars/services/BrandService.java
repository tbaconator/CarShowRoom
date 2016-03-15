package cars.services;

import java.util.List;

import cars.entities.CarBrand;

public interface BrandService {

	/**
	 * Adds new item to CarBrand
	 * 
	 * @param CarBrand
	 * @return
	 */
	void add(CarBrand CarBrand);

	/**
	 * Retrieves all items from CarBrand
	 * 
	 * @return
	 */
	List<CarBrand> getCategories();

	/**
	 * Update information on existing CarBrand.
	 * 
	 * @param CarBrand
	 */

	void update(CarBrand CarBrand);

	/**
	 * Retrieves CarBrand information
	 * 
	 * @param CarBrandId
	 * @return
	 */
	CarBrand getCarBrandById(Integer CarBrandId);
}
