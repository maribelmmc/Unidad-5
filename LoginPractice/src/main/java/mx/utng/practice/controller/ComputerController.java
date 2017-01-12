package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import mx.utng.practice.model.Computer;
import mx.utng.practice.repository.ComputerRepository;




@Named
@ViewScoped
public class ComputerController {
	@Autowired
	private ComputerRepository computerRository;
	private Computer computer=new Computer();
	private boolean editMode=false;
	private List<Computer> computers;
	@PostConstruct
	public void init(){
		setComputers(computerRository.findAll());
	}
	/**
	 * @return the phones
	 */
	public List<Computer> getComputers() {
		return computers;
	}
	/**
	 * @param computers the phones to set
	 */
	public void setComputers(List<Computer> computers) {
		this.computers = computers;
	}


	public void save(){
		computerRository.save(computer);
		if(!editMode){
			getComputers().add(computer);
		}
		computer=new Computer();
		setEditMode(false);
	}
	
	public void delete(Computer computer){
		computerRository.delete(computer);
		computers.remove(computer);
	}
	
	public void update(Computer computer){
		setComputer(computer);
		setEditMode(true);
	}
	public void cancel(){
		computer=new Computer();
		setEditMode(false);
	}
	
	  
	/**
	 * @return the phone
	 */
	public Computer getComputer() {
		return computer;
	}
	/**
	 * @param soda the phone to set
	 */
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	/**
	 * @return the editMode
	 */
	public boolean isEditMode() {
		return editMode;
	}
	/**
	 * @param editMode the editMode to set
	 */
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
	
	 
}
