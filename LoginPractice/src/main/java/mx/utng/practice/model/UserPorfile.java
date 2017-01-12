package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table (name="userPorfile")
public class UserPorfile {
	@Id @GeneratedValue
	private Long porfileId;
	private String userId;
	private String propertyDefinitionId;
	private String propertyValue;
	private String propertyText;
	private String visivility;
	private String lastUpdateDate;
	

	
	
	
	public UserPorfile(String userId, String propertyDefinitionId, String propertyValue, String propertyText, String visivility, String lastUpdateDate) {
		super();
		this.userId = userId;
		this.propertyDefinitionId = propertyDefinitionId;
		this.propertyValue= propertyValue;
		this.propertyText= propertyText;
		this.visivility= visivility;
		this.lastUpdateDate= lastUpdateDate;
	}
	 
	public UserPorfile() {
	this("","","","","","");
	}

	public Long getPorfileId() {
		return porfileId;
	}
	
	public void setPorfileId(Long porfileId) {
		this.porfileId = porfileId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPropertyDefinitionId() {
		return propertyDefinitionId;
	}

	public void setPropertyDefinitionId(String propertyDefinitionId) {
		this.propertyDefinitionId = propertyDefinitionId;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}
	
	public String getPropertyText() {
		return propertyText;
	}

	public void setPropertyText(String propertyText) {
		this.propertyText = propertyText;
	}
	
	public String getVisivility() {
		return visivility;
	}

	public void setVisivility(String visivility) {
		this.visivility = visivility;
	}
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	

}
