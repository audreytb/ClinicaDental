package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Diagnosis <T>{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T presumptive_diagnosis;
	@Persistent private T definitive_diagnosis;
	@Persistent private Query<T> query;
	public Diagnosis(T presumptive_diagnosis, T definitive_diagnosis, Query<T> query) {
		super();
		this.presumptive_diagnosis = presumptive_diagnosis;
		this.definitive_diagnosis = definitive_diagnosis;
		this.query = query;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public T getPresumptive_diagnosis() {
		return presumptive_diagnosis;
	}
	public void setPresumptive_diagnosis(T presumptive_diagnosis) {
		this.presumptive_diagnosis = presumptive_diagnosis;
	}
	public T getDefinitive_diagnosis() {
		return definitive_diagnosis;
	}
	public void setDefinitive_diagnosis(T definitive_diagnosis) {
		this.definitive_diagnosis = definitive_diagnosis;
	}
	public Query<T> getQuery() {
		return query;
	}
	public void setQuery(Query<T> query) {
		this.query = query;
	}
	
	
}
