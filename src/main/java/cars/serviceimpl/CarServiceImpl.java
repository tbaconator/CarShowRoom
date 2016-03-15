package cars.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cars.dao.CarDao;
import cars.entities.Car;
import cars.services.CarService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDao carDao;

	public void setCarDao(CarDao carDao) {
		this.carDao = carDao;
	}

	@Override
	public void add(Car car) {
		carDao.add(car);
	}

	@Override
	public List<Car> getCars() {

		return carDao.getAllCars();
	}

	@Override
	public void update(Car car) {
		carDao.update(car);

	}

	@Override
	public Car getCarById(Integer CarId) {
		// TODO Auto-generated method stub
		return null;
	}
}
