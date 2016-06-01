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
	@Persistent private Background background=new Background();
	@Persistent (mappedBy = "query")private Current_Illness current_illness=new Current_Illness();
	@Persistent (mappedBy = "query")private Diagnosis diagnosis=new Diagnosis();
	@Persistent (mappedBy = "query")private Forecast forecast=new Forecast();
	@Persistent (mappedBy = "query")private Odontograma odontograma=new Odontograma();
	@Persistent (mappedBy = "query")private Patient_Discharge patient_discharge=new Patient_Discharge();;
	@Persistent (mappedBy = "query")private Physical_Exploration physical_exploration=new Physical_Exploration();
	@Persistent (mappedBy = "query")private Treatment_Recomendation treatment_recomendation=new Treatment_Recomendation();
	@Persistent (mappedBy = "query")private Workplan workplan=new Workplan();
	
	
	@Persistent(mappedBy = "query") private Patient patient;

	public Query() {
		
	}
	
	
	
	
}