package cars.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CarColor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer colorId;
	@Column(name="color")
	private Integer colorName;

	public Integer getColorId() {
		return colorId;
	}

	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}

	public Integer getColorName() {
		return colorName;
	}

	public void setColorName(Integer colorName) {
		this.colorName = colorName;
	}

}
