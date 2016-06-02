package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Current_Illness {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private String enfermedad_actual;
	@Persistent private String data_reporting;
	@Persistent private String reason_consultation;
	@Persistent private String sick_time;
	@Persistent private String signs_symptoms_main;
	@Persistent private String chronological_story;
	@Persistent private String biological_functions;
	
	
	public Current_Illness() {
		super();
	}
	
	
	
	
	
	
}
