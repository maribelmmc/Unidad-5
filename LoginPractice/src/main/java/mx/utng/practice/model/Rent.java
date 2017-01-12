package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name="rent")
public class Rent {
	@Id @GeneratedValue
	private Long id;
	private String rental;
	private String house;
	private String dateFrom;
	private String dateTo;
	
	
	
	public Rent(String rental, String house, String dateFrom, String dateTo) {
		super();
		this.rental = rental;
		this.house = house;
		this.dateFrom= dateFrom;
		this.dateTo= dateTo;
	}
	 
	public Rent() {
	this("","","","");
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRental() {
		return rental;
	}
	
	public void setRental(String rental) {
		this.rental = rental;
	}
	
	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	
	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	

}
