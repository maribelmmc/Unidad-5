package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name="machine")
public class Machine {
	@Id @GeneratedValue
	private Long id;
	private String description;
	private String color;
	private String company;
	
	
	
	
	public Machine(String description, String color, String company) {
		super();
		this.description = description;
		this.color = color;
		this.company= company;
	}
	 
	public Machine() {
	this("" ,"","");
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
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
	

}
