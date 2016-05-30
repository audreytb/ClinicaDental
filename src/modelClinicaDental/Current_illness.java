package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Current_illness <T>{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T enfermedad_actual;
	@Persistent private T data_reporting;
	@Persistent private T reason_consultation;
	@Persistent private T sick_time;
	@Persistent private T signs_symptoms_main;
	@Persistent private T chronological_story;
	@Persistent private T biological_functions;
	@Persistent private Query<T> query;
	public Current_illness(T enfermedad_actual, T data_reporting, T reason_consultation, T sick_time,
			T signs_symptoms_main, T chronological_story, T biological_functions, Query<T> query) {
		super();
		this.enfermedad_actual = enfermedad_actual;
		this.data_reporting = data_reporting;
		this.reason_consultation = reason_consultation;
		this.sick_time = sick_time;
		this.signs_symptoms_main = signs_symptoms_main;
		this.chronological_story = chronological_story;
		this.biological_functions = biological_functions;
		this.query = query;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public T getEnfermedad_actual() {
		return enfermedad_actual;
	}
	public void setEnfermedad_actual(T enfermedad_actual) {
		this.enfermedad_actual = enfermedad_actual;
	}
	public T getData_reporting() {
		return data_reporting;
	}
	public void setData_reporting(T data_reporting) {
		this.data_reporting = data_reporting;
	}
	public T getReason_consultation() {
		return reason_consultation;
	}
	public void setReason_consultation(T reason_consultation) {
		this.reason_consultation = reason_consultation;
	}
	public T getSick_time() {
		return sick_time;
	}
	public void setSick_time(T sick_time) {
		this.sick_time = sick_time;
	}
	public T getSigns_symptoms_main() {
		return signs_symptoms_main;
	}
	public void setSigns_symptoms_main(T signs_symptoms_main) {
		this.signs_symptoms_main = signs_symptoms_main;
	}
	public T getChronological_story() {
		return chronological_story;
	}
	public void setChronological_story(T chronological_story) {
		this.chronological_story = chronological_story;
	}
	public T getBiological_functions() {
		return biological_functions;
	}
	public void setBiological_functions(T biological_functions) {
		this.biological_functions = biological_functions;
	}
	public Query<T> getQuery() {
		return query;
	}
	public void setQuery(Query<T> query) {
		this.query = query;
	}
	
	
	
	
	
}
