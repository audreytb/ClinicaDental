package modelClinicaDental;

import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Query {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
    
	@Persistent private String querys;
	
	@Persistent private Background background;
	@Persistent private Current_Illness current_illness;
	@Persistent private Diagnosis diagnosis;
	@Persistent private Forecast forecast;
	@Persistent private Odontograma odontograma;
	@Persistent private Patient_Discharge patient_discharge;
	@Persistent private Physical_Exploration physical_exploration;
	@Persistent private Treatment_Recomendation treatment_recomendation;
	@Persistent private Workplan workplan;
	
	@Persistent private Patient patient;
	@Persistent private Long patientId;

	public Query() {
		
	}

	public Query(Current_Illness current_illness) {
		super();
		this.current_illness = current_illness;
	}
	

}