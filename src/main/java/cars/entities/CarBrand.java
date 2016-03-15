package cars.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CarBrand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer brandId;
	@Column(name="brand")
	private Integer brandName;
	
	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getBrandName() {
		return brandName;
	}

	public void setBrandName(Integer brandName) {
		this.brandName = brandName;
	}

}
