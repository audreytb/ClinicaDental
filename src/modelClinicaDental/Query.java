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
	
	@Persistent private Patient patient;
	@Persistent private Long queryId;

	public Query() {
		
	}

	public Query(Current_Illness current_illness) {
		super();
		this.current_illness = current_illness;
	}

	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getQuerys() {
		return querys;
	}

	public void setQuerys(String querys) {
		this.querys = querys;
	}

	public Background getBackground() {
		return background;
	}

	public void setBackground(Background background) {
		this.background = background;
	}

	public Current_Illness getCurrent_illness() {
		return current_illness;
	}

	public void setCurrent_illness(Current_Illness current_illness) {
		this.current_illness = current_illness;
	}

	public Diagnosis getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(Diagnosis diagnosis) {
		this.diagnosis = diagnosis;
	}

	public Forecast getForecast() {
		return forecast;
	}

	public void setForecast(Forecast forecast) {
		this.forecast = forecast;
	}

	public Odontograma getOdontograma() {
		return odontograma;
	}

	public void setOdontograma(Odontograma odontograma) {
		this.odontograma = odontograma;
	}

	public Patient_Discharge getPatient_discharge() {
		return patient_discharge;
	}

	public void setPatient_discharge(Patient_Discharge patient_discharge) {
		this.patient_discharge = patient_discharge;
	}

	public PhysicalExploration getPhysical_exploration() {
		return physical_exploration;
	}

	public void setPhysical_exploration(PhysicalExploration physical_exploration) {
		this.physical_exploration = physical_exploration;
	}

	public Treatment_Recomendation getTreatment_recomendation() {
		return treatment_recomendation;
	}

	public void setTreatment_recomendation(Treatment_Recomendation treatment_recomendation) {
		this.treatment_recomendation = treatment_recomendation;
	}

	public Workplan getWorkplan() {
		return workplan;
	}

	public void setWorkplan(Workplan workplan) {
		this.workplan = workplan;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Long getQueryId() {
		return queryId;
	}

	public void setQueryId(Long queryId) {
		this.queryId = queryId;
	}

	@Override
	public String toString() {
		return "Query [key=" + key + ", querys=" + querys + ", background=" + background + ", current_illness="
				+ current_illness + ", diagnosis=" + diagnosis + ", forecast=" + forecast + ", odontograma="
				+ odontograma + ", patient_discharge=" + patient_discharge + ", physical_exploration="
				+ physical_exploration + ", treatment_recomendation=" + treatment_recomendation + ", workplan="
				+ workplan + ", patient=" + patient + ", queryId=" + queryId + "]";
	}

	
	

}