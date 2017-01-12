package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import mx.utng.practice.model.Fragrance;
import mx.utng.practice.repository.FragranceRepository;


@Named
@ViewScoped
public class FragranceController {
	
	@Autowired
	private FragranceRepository fragranceRository;
	private Fragrance fragrance=new Fragrance();
	private boolean editMode=false;
	private List<Fragrance> fragrances;
	@PostConstruct
	public void init(){
		setFragrances(fragranceRository.findAll());
	}
	
	public List<Fragrance> getFragrances() {
		return fragrances;
	}
	
	public void setFragrances(List<Fragrance> fragrances) {
		this.fragrances = fragrances;
	}


	public void save(){
		fragranceRository.save(fragrance);
		if(!editMode){
			getFragrances().add(fragrance);
		}
		fragrance=new Fragrance();
		setEditMode(false);
	}
	
	public void delete(Fragrance fragrance){
		fragranceRository.delete(fragrance);
		fragrances.remove(fragrance);
	}
	
	public void update(Fragrance fragrance){
		setFragrance(fragrance);
		setEditMode(true);
	}
	public void cancel(){
		fragrance=new Fragrance();
		setEditMode(false);
	}
	
	public Fragrance getFragrance() {
		return fragrance;
	}
	
	public void setFragrance(Fragrance fragrance) {
		this.fragrance = fragrance;
	}
	
	public boolean isEditMode() {
		return editMode;
	}
	
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}	
	
}