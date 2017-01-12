package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Juice;

import mx.utng.practice.repository.JuiceRepository;

@Named
@ViewScoped
public class JuiceController {
	@Autowired
	private JuiceRepository juiceRository;
	private Juice juice=new Juice();
	private boolean editMode=false;
	private List<Juice> juices;
	@PostConstruct
	public void init(){
		setJuices(juiceRository.findAll());
	}
	/**
	 * @return the cakes
	 */
	public List<Juice> getJuices() {
		return juices;
	}
	
	public void setJuices(List<Juice> juices) {
		this.juices = juices;
	}


	public void save(){
		juiceRository.save(juice);
		if(!editMode){
			getJuices().add(juice);
		}
		juice=new Juice();
		setEditMode(false);
	}
	
	public void delete(Juice juice){
		juiceRository.delete(juice);
		juices.remove(juice);
	}
	
	public void update(Juice juice){
		setJuice(juice);
		setEditMode(true);
	}
	public void cancel(){
		juice=new Juice();
		setEditMode(false);
	}
	
	  
	/**
	 * @return the cake
	 */
	public Juice getJuice() {
		return juice;
	}
	/**
	 * @param cake the cake to set
	 */
	public void setJuice(Juice juice) {
		this.juice = juice;
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
