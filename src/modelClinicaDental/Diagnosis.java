package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Diagnosis {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String presumptive_diagnosis;
	@Persistent private String definitive_diagnosis;
	@Persistent private String diagnosisId;
	
	public Diagnosis() {
		super();
	}

	public Diagnosis(String presumptive_diagnosis, String definitive_diagnosis, String diagnosisId) {
		super();
		this.presumptive_diagnosis = presumptive_diagnosis;
		this.definitive_diagnosis = definitive_diagnosis;
		this.diagnosisId = diagnosisId;
	}

	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getPresumptive_diagnosis() {
		return presumptive_diagnosis;
	}

	public void setPresumptive_diagnosis(String presumptive_diagnosis) {
		this.presumptive_diagnosis = presumptive_diagnosis;
	}

	public String getDefinitive_diagnosis() {
		return definitive_diagnosis;
	}

	public void setDefinitive_diagnosis(String definitive_diagnosis) {
		this.definitive_diagnosis = definitive_diagnosis;
	}

	public String getDiagnosisId() {
		return diagnosisId;
	}

	public void setDiagnosisId(String diagnosisId) {
		this.diagnosisId = diagnosisId;
	}

	@Override
	public String toString() {
		return "Diagnosis [key=" + key + ", presumptive_diagnosis=" + presumptive_diagnosis + ", definitive_diagnosis="
				+ definitive_diagnosis + ", diagnosisId=" + diagnosisId + "]";
	}
	
	
	
}
