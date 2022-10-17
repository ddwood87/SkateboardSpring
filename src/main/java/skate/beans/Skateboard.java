package skate.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author dominicwood - ddwood2@dmacc.edu
 * CIS175 - Fall 2022
 * Oct 17, 2022
 */
@Entity
public class Skateboard {
	@Id
	@GeneratedValue
	private long id;
	private String brand;
	private double width;
	private int wheelSize;
	
	@Override
	public String toString() {
		return "SkateboardBean [id=" + id + ", brand=" + brand + ", width=" + width + ", wheelSize=" + wheelSize + "]";
	}
	public Skateboard(String brand) {
		super();
		this.brand = brand;
	}
	public Skateboard(String brand, double width, int wheelSize) {
		super();
		this.brand = brand;
		this.width = width;
		this.wheelSize = wheelSize;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public int getWheelSize() {
		return wheelSize;
	}
	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}
	public Skateboard() {
		super();
	}
}
