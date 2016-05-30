package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Query<T> {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T query;
	@Persistent private Background<T> background;
	@Persistent private Current_illness<T> current_illness;
	@Persistent private Diagnosis<T> diagnosis;
	@Persistent private Forecast<T> forecast;
	@Persistent private Odontograma<T> odontograma;
	@Persistent private Patient_discharge<T> patient_discharge;
	@Persistent private Physical_exploration<T> physical_exploration;
	@Persistent private Treatment_recomendation<T> treatment_recomendation;
	@Persistent private Workplan<T> workplan;
	@Persistent private Patient<T> patient;
	
	
	
	public Query(T query, Background<T> background, Current_illness<T> current_illness, Diagnosis<T> diagnosis,
			Forecast<T> forecast, Odontograma<T> odontograma, Patient_discharge<T> patient_discharge,
			Physical_exploration<T> physical_exploration, Treatment_recomendation<T> treatment_recomendation,
			Workplan<T> workplan, Patient<T> patient) {
		super();
		this.query = query;
		this.background = background;
		this.current_illness = current_illness;
		this.diagnosis = diagnosis;
		this.forecast = forecast;
		this.odontograma = odontograma;
		this.patient_discharge = patient_discharge;
		this.physical_exploration = physical_exploration;
		this.treatment_recomendation = treatment_recomendation;
		this.workplan = workplan;
		this.patient = patient;
	}
	public Query(Patient<T> patient) {
		super();
		this.patient = patient;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public T getQuery() {
		return query;
	}
	public void setQuery(T query) {
		this.query = query;
	}
	public Background<T> getBackground() {
		return background;
	}
	public void setBackground(Background<T> background) {
		this.background = background;
	}
	public Current_illness<T> getCurrent_illness() {
		return current_illness;
	}
	public void setCurrent_illness(Current_illness<T> current_illness) {
		this.current_illness = current_illness;
	}
	public Diagnosis<T> getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(Diagnosis<T> diagnosis) {
		this.diagnosis = diagnosis;
	}
	public Forecast<T> getForecast() {
		return forecast;
	}
	public void setForecast(Forecast<T> forecast) {
		this.forecast = forecast;
	}
	public Odontograma<T> getOdontograma() {
		return odontograma;
	}
	public void setOdontograma(Odontograma<T> odontograma) {
		this.odontograma = odontograma;
	}
	public Patient_discharge<T> getPatient_discharge() {
		return patient_discharge;
	}
	public void setPatient_discharge(Patient_discharge<T> patient_discharge) {
		this.patient_discharge = patient_discharge;
	}
	public Physical_exploration<T> getPhysical_exploration() {
		return physical_exploration;
	}
	public void setPhysical_exploration(Physical_exploration<T> physical_exploration) {
		this.physical_exploration = physical_exploration;
	}
	public Treatment_recomendation<T> getTreatment_recomendation() {
		return treatment_recomendation;
	}
	public void setTreatment_recomendation(Treatment_recomendation<T> treatment_recomendation) {
		this.treatment_recomendation = treatment_recomendation;
	}
	public Workplan<T> getWorkplan() {
		return workplan;
	}
	public void setWorkplan(Workplan<T> workplan) {
		this.workplan = workplan;
	}
	public Patient<T> getPatient() {
		return patient;
	}
	public void setPatient(Patient<T> patient) {
		this.patient = patient;
	}
	
}