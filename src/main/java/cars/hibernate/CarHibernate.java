package cars.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import cars.dao.CarDao;
import cars.entities.Car;

@Transactional
@Component
public class CarHibernate implements CarDao {

	@PersistenceContext
	private EntityManager em;

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public void add(Car car) {
		em.persist(car);
	}

	@Override
	public List<Car> getAllCars() {
		return em.createQuery("SELECT c FROM Car c", Car.class).getResultList();
	}

	@Override
	public Car getByCarId(Integer carId) {
		return em.find(Car.class, carId);
	}

	/*@Override
	public void delete(Car car) {
		em.remove(car);

	}*/

	@Override
	public void update(Car car) {
		em.merge(car);

	}

}
