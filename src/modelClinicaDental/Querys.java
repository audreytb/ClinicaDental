package modelClinicaDental;

import javax.jdo.annotations.PrimaryKey;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Querys{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	/**
	@Persistent private String querys="2";
	
	@Persistent private Background background;
	@Persistent private Current_Illness current_illness;
	@Persistent private Diagnosis diagnosis;
	@Persistent private Forecast forecast;
	@Persistent private Odontograma odontograma;
	@Persistent private Patient_Discharge patient_discharge;
	@Persistent private PhysicalExploration physical_exploration;
	@Persistent private Treatment_Recomendation treatment_recomendation;
	@Persistent private Workplan workplan;
	**/
	//@Persistent private Patient patient;
	@Persistent private String queryId;//@Persistent private String patientId; creando identificador de patient
	
	
	

	public Querys() {
		
	}

	public String getKey() {
		return KeyFactory.keyToString(key);
	}

	public Querys(String queryId) {
		super();
		this.queryId = queryId;
	}

	public void setKey(String key) {
		
		Key keyQuery = KeyFactory.stringToKey(key);
		this.key = KeyFactory.createKey(keyQuery,
				Querys.class.getSimpleName(), java.util.UUID.randomUUID().toString());
	}

	public String getQueryId() {
		return queryId;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	@Override
	public String toString() {
		return "Query [key=" + key + ", queryId=" + queryId + "]";
	}

	

}