package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Dentist <T>{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T name;
	@Persistent private T last_name;
	@Persistent private T tuition;
	@Persistent private Patient<T>[] patient;
	@Persistent private Calendar<T> calendar;
	
	public Dentist() {
		super();
	}
	public Dentist(T name, T last_name, T tuition, Patient<T>[] patient, Calendar<T> calendar) {
		super();
		this.name = name;
		this.last_name = last_name;
		this.tuition = tuition;
		this.patient = patient;
		this.calendar = calendar;
	}
	public Dentist(T name, T last_name, T tuition, Calendar<T> calendar) {
		super();
		this.name = name;
		this.last_name = last_name;
		this.tuition = tuition;
		this.calendar = calendar;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getLast_name() {
		return last_name;
	}
	public void setLast_name(T last_name) {
		this.last_name = last_name;
	}
	public T getTuition() {
		return tuition;
	}
	public void setTuition(T tuition) {
		this.tuition = tuition;
	}
	public Patient<T>[] getPatient() {
		return patient;
	}
	public void setPatient(Patient<T>[] patient) {
		this.patient = patient;
	}
	public Calendar<T> getCalendar() {
		return calendar;
	}
	public void setCalendar(Calendar<T> calendar) {
		this.calendar = calendar;
	}
	
	
	
	
}
