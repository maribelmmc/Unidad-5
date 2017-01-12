package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;


import mx.utng.practice.model.UserPorfile;

import mx.utng.practice.repository.UserPorfileRepository;

@Named
@ViewScoped
public class UserPorfileController {
	
	@Autowired
	private UserPorfileRepository userPorfileRepository;
	private UserPorfile userPorfile=new UserPorfile();
	private boolean editMode=false;
	private List<UserPorfile> userPorfiles;
	@PostConstruct
	public void init(){
		setUserPorfiles(userPorfileRepository.findAll());
	}
	
	public List<UserPorfile> getUserPorfiles() {
		return userPorfiles;
	}
	
	public void setUserPorfiles(List<UserPorfile> userPorfiles) {
		this.userPorfiles = userPorfiles;
	}


	public void save(){
		userPorfileRepository.save(userPorfile);
		if(!editMode){
			getUserPorfiles().add(userPorfile);
		}
		userPorfile=new UserPorfile();
		setEditMode(false);
	}
	
	public void delete(UserPorfile userPorfile){
		userPorfileRepository.delete(userPorfile);
		userPorfiles.remove(userPorfile);
	}
	
	public void update(UserPorfile userPorfile){
		setUserPorfile(userPorfile);
		setEditMode(true);
	}
	public void cancel(){
		userPorfile=new UserPorfile();
		setEditMode(false);
	}
	public UserPorfile getUserPorfile() {
		return userPorfile;
	}
	
	public void setUserPorfile(UserPorfile userPorfile) {
		this.userPorfile = userPorfile;
	}
	
	public boolean isEditMode() {
		return editMode;
	}
	
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
	
	
}