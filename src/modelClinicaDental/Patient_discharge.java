package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Patient_discharge <T>{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T patientDischarge;
	public Patient_discharge(T patientDischarge) {
		super();
		this.patientDischarge = patientDischarge;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public T getPatientDischarge() {
		return patientDischarge;
	}
	public void setPatientDischarge(T patientDischarge) {
		this.patientDischarge = patientDischarge;
	}
	
}
