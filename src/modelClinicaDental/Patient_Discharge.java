package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Patient_Discharge {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String patientDischarge;
	@Persistent private String patient_dischargeId;
	public Patient_Discharge() {
	}
	public Patient_Discharge(String patientDischarge, String patient_dischargeId) {
		super();
		this.patientDischarge = patientDischarge;
		this.patient_dischargeId = patient_dischargeId;
	}
	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public String getPatientDischarge() {
		return patientDischarge;
	}
	public void setPatientDischarge(String patientDischarge) {
		this.patientDischarge = patientDischarge;
	}
	public String getPatient_dischargeId() {
		return patient_dischargeId;
	}
	public void setPatient_dischargeId(String patient_dischargeId) {
		this.patient_dischargeId = patient_dischargeId;
	}
	@Override
	public String toString() {
		return "Patient_Discharge [key=" + key + ", patientDischarge=" + patientDischarge + ", patient_dischargeId="
				+ patient_dischargeId + "]";
	}
	
	
	
}
