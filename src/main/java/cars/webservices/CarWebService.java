package cars.webservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cars.entities.Car;
import cars.services.CarService;

@RestController
public class CarWebService {

	@Autowired
	private CarService carService;

	/**
	 * set the employee service
	 * 
	 * @param carService
	 */
	public void setCarService(CarService carService) {
		this.carService = carService;
	}

	/**
	 * RestController Mapping Adding new employee for registration page
	 * 
	 * @param employee
	 */
	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	public void add(@RequestBody Car car) {
		carService.add(car);
	}

	/**
	 * Retrieves a list of employees
	 * 
	 * @param active
	 * @return all Employee objects
	 */
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	public List<Car> getAllCars() {
		return carService.getCars();
	}

	/**
	 * @param employeeID
	 *            of Type Employee
	 * @return employee by employeeID from Service
	 */
	@RequestMapping(value = "/employees/{employeeID}", method = RequestMethod.GET)
	public Car getCarId(@PathVariable Integer carId) {
		return carService.getCarById(carId);
	}

	/**
	 * @param employeeID
	 *            of Type Employee
	 * @return employee by employeeID from Service
	 */
	@RequestMapping(value = "/employees/{employeeID}", method = RequestMethod.PUT)
	public void update(@PathVariable Car car) {
		carService.update(car);
	}

}
