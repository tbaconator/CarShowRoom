package cars.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CarInfo")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer carId;
	@Column(name = "name")
	private String carName;
	/*
	 * @Column(name = "brand") private CarBrand brand;
	 * 
	 * @Column(name = "color") private CarColor color;
	 * 
	 * @Column(name = "type") private CarType type;
	 */
	@Column(name = "price")
	private BigDecimal price;

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	/*
	 * public CarBrand getBrand() { return brand; }
	 * 
	 * public void setBrand(CarBrand brand) { this.brand = brand; }
	 * 
	 * public CarColor getColor() { return color; }
	 * 
	 * public void setColor(CarColor color) { this.color = color; }
	 * 
	 * public CarType getType() { return type; }
	 * 
	 * public void setType(CarType type) { this.type = type; }
	 */

	public BigDecimal getPrice() {
		return price;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
