package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name="computer")
public class Computer {
	@Id @GeneratedValue
	private Long id;
	private String brand;
	private String capacity;
	private String color;
	private String description;
	
	
	
	
	public Computer(String brand, String capacity,String color, String description) {
		super();
		this.brand = brand;
		this.capacity = capacity;
		this.color= color;
		this.description= description;
	}
	 
	public Computer() {
	this("" ,"","","");
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the description to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the color
	 */
	public String getCapacity() {
		return capacity;
	}
	/**
	 * @param quantity the color to set
	 */
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
	

}
