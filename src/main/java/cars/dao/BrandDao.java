package cars.dao;

import java.util.List;

import cars.entities.CarBrand;

public interface BrandDao {

	void add(CarBrand carBrand);

	void update(CarBrand carBrand);

	void delete(CarBrand carBrand);

	List<CarBrand> getAllCarBrands();

	CarBrand getByCarCarBrandId(Integer carBrandId);

}
