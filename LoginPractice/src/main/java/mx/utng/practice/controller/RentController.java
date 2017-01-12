package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import mx.utng.practice.model.Rent;
import mx.utng.practice.repository.RentRepository;

@Named
@ViewScoped
public class RentController {
	
	@Autowired
	private RentRepository rentRepository;
	private Rent rent=new Rent();
	private boolean editMode=false;
	private List<Rent> rents;
	@PostConstruct
	public void init(){
		setRents(rentRepository.findAll());
	}
	
	public List<Rent> getRents() {
		return rents;
	}
	
	public void setRents(List<Rent> rents) {
		this.rents = rents;
	}


	public void save(){
		rentRepository.save(rent);
		
		if(!editMode){
			getRents().add(rent);
		}
		rent=new Rent();
		
		setEditMode(false);
	}
	
	public void delete(Rent rent){
		rentRepository.delete(rent);
		rents.remove(rent);
	}
	
	public void update(Rent rent){
		setRent(rent);
		setEditMode(true);
	}
	public void cancel(){
		rent=new Rent();
		setEditMode(false);
	}
	
	  
	
	public Rent getRent() {
		return rent;
	}
	
	public void setRent(Rent rent) {
		this.rent = rent;
	}
	
	public boolean isEditMode() {
		return editMode;
	}
	
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
	
}