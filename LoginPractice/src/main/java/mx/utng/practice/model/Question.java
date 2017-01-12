package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name="question")
public class Question {
	@Id @GeneratedValue
	private Long id;
	private String examId;
	private String text;
	private String url;
	private String explanation;
	private String mark;
	private String isMultiSelect;
	private String startSeconds;
	
	
	public Question(String examId, String text,String url, String explanation, String mark, String isMultiSelect, String startSeconds) {
		super();
		this.examId = examId;
		this.text = text;
		this.url= url;
		this.explanation= explanation;
		this.mark= mark;
		this.isMultiSelect= isMultiSelect;
		this.startSeconds= startSeconds;
	}
	 
	public Question() {
	this("" ,"","","","","","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getIsMultiSelect() {
		return isMultiSelect;
	}

	public void setIsMultiSelect(String isMultiSelect) {
		this.isMultiSelect = isMultiSelect;
	}

	public String getStartSeconds() {
		return startSeconds;
	}

	public void setStartSeconds(String startSeconds) {
		this.startSeconds = startSeconds;
	}

	
	

}
