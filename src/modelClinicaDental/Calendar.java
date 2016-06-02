package modelClinicaDental;


import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Calendar {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private String calendar;
	
	@Persistent private Dentist dentista;
	@Persistent (mappedBy = "calendar") private List<Workplan> workplan= new ArrayList <Workplan>();
	
	
	public Calendar() {
		super();
	}
	
	

	
}
