/*package cars.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cars.dao.BrandDao;
import cars.entities.CarBrand;
import cars.services.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandDao brandDao;

	public void setBrandDao(BrandDao brandDao) {
		this.brandDao = brandDao;
	}

	@Override
	public void add(CarBrand CarBrand) {
		brandDao.add(CarBrand);
	}

	@Override
	public List<CarBrand> getCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(CarBrand CarBrand) {
		// TODO Auto-generated method stub

	}

	@Override
	public CarBrand getCarBrandById(Integer CarBrandId) {
		// TODO Auto-generated method stub
		return null;
	}

}
*/