package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Dentist {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private String name;
	@Persistent private String last_name;
	@Persistent private String tuition;
	@Persistent private Patient[] patient;
	@Persistent private Calendar calendar;
	
	public Dentist() {
		super();
	}
	
	
	
	
	
}
