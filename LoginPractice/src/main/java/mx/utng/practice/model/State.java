package mx.utng.practice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class State {
	@Id @GeneratedValue
	private Long id;
	private String name;
	public State(String name) {
		super();
		this.name = name;
	}
	public State() {
		this("");
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode(){
		final int prime=31;
		int result=1;
		result=prime*result+((id==null)?0:id.hashCode());
		return result;
	}
@Override
public boolean equals(Object obj){
	if(this==obj)
		return true;
	if(obj== null)
		return false;
	if(getClass()!=obj.getClass())
		return false;
	State other=(State) obj;
	if(id==null){
		 if(other.id!=null)
			 return false;
	}else if(!id.equals(other.id))
		return false;
	if(name==null){
			if(other.name!=null)
				return false;
			
	}else if(!name.equals(other.name))
		return false;
				return true;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "State [id=" + id + ", name=" + name + "]";
}


}
