package modelClinicaDental;


import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Dentist {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String name;
	@Persistent private String last_name;
	@Persistent private String tuition;
	
	
	@Persistent private List<Patient> patient= new ArrayList <Patient>();
	@Persistent private Calendar calendar=new Calendar();
	
	public Dentist() {
		super();
	}
	
	
	
	
	
}
