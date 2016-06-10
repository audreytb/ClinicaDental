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
public class Query{
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
	@Persistent private Long queryId;

	public Query() {
		
	}

	public String getKey() {
		return KeyFactory.keyToString(key);
	}

	public void setKey(String key) {
		
		Key keyQuery = KeyFactory.stringToKey(key);
		this.key = KeyFactory.createKey(keyQuery,
				Query.class.getSimpleName(), java.util.UUID.randomUUID().toString());
	}

	public Long getQueryId() {
		return queryId;
	}

	public void setQueryId(Long queryId) {
		this.queryId = queryId;
	}

	

}