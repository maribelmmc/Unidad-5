package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.TermDefinition;

import mx.utng.practice.repository.TermDefinitionRepository;


@Named
@ViewScoped
public class TermDefinitionController {
	
	@Autowired
	private TermDefinitionRepository termDefinitionRepository;
	private TermDefinition termDefinition=new TermDefinition();
	private boolean editMode=false;
	private List<TermDefinition> termDefinitions;
	@PostConstruct
	public void init(){
		setTermDefinitions(termDefinitionRepository.findAll());
	}
	
	public List<TermDefinition> getTermDefinitions() {
		return termDefinitions;
	}
	
	public void setTermDefinitions(List<TermDefinition> termDefinitions) {
		this.termDefinitions = termDefinitions;
	}


	public void save(){
		termDefinitionRepository.save(termDefinition);
		if(!editMode){
			getTermDefinitions().add(termDefinition);
		}
		termDefinition=new TermDefinition();
		setEditMode(false);
	}
	
	public void delete(TermDefinition termDefinition){
		termDefinitionRepository.delete(termDefinition);
		termDefinitions.remove(termDefinition);
	}
	
	public void update(TermDefinition termDefinition){
		setTermDefinition(termDefinition);
		setEditMode(true);
	}
	public void cancel(){
		termDefinition=new TermDefinition();
		setEditMode(false);
	}
	public TermDefinition getTermDefinition() {
		return termDefinition;
	}
	
	public void setTermDefinition(TermDefinition termDefinition) {
		this.termDefinition = termDefinition;
	}
	
	public boolean isEditMode() {
		return editMode;
	}
	
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
	
	
}