package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name="termDefinition")
public class TermDefinition {
	@Id @GeneratedValue
	private Long termId;
	private String dbxrefId;
	private String termComment;
	private String reference;
	
	

	
	
	
	public TermDefinition( String dbxrefId, String termComment, String reference) {
		super();
		this.dbxrefId = dbxrefId;
		this.termComment= termComment;
		this.reference= reference;
	}
	 
	public TermDefinition() {
	this("","","");
	}

	public Long getTermId() {
		return termId;
	}
	
	public void setTermId(Long termId) {
		this.termId = termId;
	}
	
	
	public String getDbxrefId() {
		return dbxrefId;
	}

	public void setDbxrefId(String dbxrefId) {
		this.dbxrefId = dbxrefId;
	}

	public String getTermComment() {
		return termComment;
	}

	public void setTermComment(String termComment) {
		this.termComment = termComment;
	}
	
	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	

}
