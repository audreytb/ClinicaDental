package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Patient_Discharge <T>{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T patientDischarge;
	@Persistent private Query<T> query;
	public Patient_Discharge(T patientDischarge, Query<T> query) {
		super();
		this.patientDischarge = patientDischarge;
		this.query = query;
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
	public Query<T> getQuery() {
		return query;
	}
	public void setQuery(Query<T> query) {
		this.query = query;
	}
	
	
}
