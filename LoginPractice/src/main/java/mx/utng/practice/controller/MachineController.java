package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;


import mx.utng.practice.model.Machine;

import mx.utng.practice.repository.MachineRepository;

@Named
@ViewScoped
public class MachineController {
	@Autowired
	private MachineRepository machineRository;
	private Machine machine=new Machine();
	private boolean editMode=false;
	private List<Machine> machines;
	@PostConstruct
	public void init(){
		setMachines(machineRository.findAll());
	}
	/**
	 * @return the phones
	 */
	public List<Machine> getMachines() {
		return machines;
	}
	/**
	 * @param phones the phones to set
	 */
	public void setMachines(List<Machine> machines) {
		this.machines = machines;
	}


	public void save(){
		machineRository.save(machine);
		if(!editMode){
			getMachines().add(machine);
		}
		machine=new Machine();
		setEditMode(false);
	}
	
	public void delete(Machine machine){
		machineRository.delete(machine);
		machines.remove(machine);
	}
	
	public void update(Machine machine){
		setMachine(machine);
		setEditMode(true);
	}
	public void cancel(){
		machine=new Machine();
		setEditMode(false);
	}
	
	  
	/**
	 * @return the phone
	 */
	public Machine getMachine() {
		return machine;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setMachine(Machine machine) {
		this.machine = machine;
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
