package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import mx.utng.practice.model.Rent;
import mx.utng.practice.model.State;
import mx.utng.practice.repository.RentRepository;
import mx.utng.practice.repository.StateRepository;

@Named
@ViewScoped
public class StateController {
	
	@Autowired
	private StateRepository stateRepository;
	private State state=new State();
	private boolean editMode=false;
	private List<State> states;
	@PostConstruct
	public void init(){
		setStates(stateRepository.findAll());
	}
	
	public List<State> getStates() {
		return states;
	}
	
	public void setStates(List<State> states) {
		this.states = states;
	}


	public void save(){
		stateRepository.save(state);
		
		if(!editMode){
			getStates().add(state);
		}
		state=new State();
		
		setEditMode(false);
	}
	
	public void delete(State state){
		stateRepository.delete(state);
		states.remove(state);
	}
	
	public void update(State state){
		setState(state);
		setEditMode(true);
	}
	public void cancel(){
		state=new State();
		setEditMode(false);
	}
	
	  
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public boolean isEditMode() {
		return editMode;
	}
	
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
	
}