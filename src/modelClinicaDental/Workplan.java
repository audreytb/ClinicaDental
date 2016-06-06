package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Workplan {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String work_plan;
	@Persistent private Calendar calendar;
	@Persistent private String work_planId;

	
	public Workplan() {
		super();
	}


	public Workplan(String work_plan, String work_planId) {
		super();
		this.work_plan = work_plan;
		this.work_planId = work_planId;
	}


	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}


	public void setKey(Key key) {
		this.key = key;
	}


	public String getWork_plan() {
		return work_plan;
	}


	public void setWork_plan(String work_plan) {
		this.work_plan = work_plan;
	}


	public Calendar getCalendar() {
		return calendar;
	}


	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}


	public String getWork_planId() {
		return work_planId;
	}


	public void setWork_planId(String work_planId) {
		this.work_planId = work_planId;
	}


	@Override
	public String toString() {
		return "Workplan [key=" + key + ", work_plan=" + work_plan + ", calendar=" + calendar + ", work_planId="
				+ work_planId + "]";
	}	
	
	
	
}
