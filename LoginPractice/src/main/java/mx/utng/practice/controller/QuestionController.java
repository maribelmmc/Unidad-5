package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;


import mx.utng.practice.model.Question;


import mx.utng.practice.repository.QuestionRepository;




@Named
@ViewScoped
public class QuestionController {
	@Autowired
	private QuestionRepository questionRository;
	private Question question=new Question();
	private boolean editMode=false;
	private List<Question> questions;
	@PostConstruct
	public void init(){
		setQuestions(questionRository.findAll());
	}
	
	public List<Question> getQuestions() {
		return questions;
	}
	
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}


	public void save(){
		questionRository.save(question);
		if(!editMode){
			getQuestions().add(question);
		}
		question=new Question();
		setEditMode(false);
	}
	
	public void delete(Question question){
		questionRository.delete(question);
		questions.remove(question);
	}
	
	public void update(Question question){
		setQuestion(question);
		setEditMode(true);
	}
	public void cancel(){
		question=new Question();
		setEditMode(false);
	}
	
	  
	
	public Question getQuestion() {
		return question;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	public boolean isEditMode() {
		return editMode;
	}
	
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
	
	 
}
