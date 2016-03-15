package cars.dao;

import java.util.List;

import cars.entities.CarColor;

public interface ColorDao {

	void add(CarColor carColor);

	void update(CarColor carColor);

	void delete(CarColor carColor);

	List<CarColor> getAllCarColors();

	CarColor getByCarcarColorId(Integer carColorId);
}
