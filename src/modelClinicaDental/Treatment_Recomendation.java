package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Treatment_Recomendation <T>{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T treatmentRecomendations;
	@Persistent private T generic_drug_name;
	@Persistent private T dose;
	@Persistent private T way_administration;
	@Persistent private T care;
	@Persistent private T hygiene_measures_dietary;
	@Persistent private T preventive;
	@Persistent private Query<T> query;
	public Treatment_Recomendation(T treatmentRecomendations, T generic_drug_name, T dose, T way_administration, T care,
			T hygiene_measures_dietary, T preventive, Query<T> query) {
		super();
		this.treatmentRecomendations = treatmentRecomendations;
		this.generic_drug_name = generic_drug_name;
		this.dose = dose;
		this.way_administration = way_administration;
		this.care = care;
		this.hygiene_measures_dietary = hygiene_measures_dietary;
		this.preventive = preventive;
		this.query = query;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public T getTreatmentRecomendations() {
		return treatmentRecomendations;
	}
	public void setTreatmentRecomendations(T treatmentRecomendations) {
		this.treatmentRecomendations = treatmentRecomendations;
	}
	public T getGeneric_drug_name() {
		return generic_drug_name;
	}
	public void setGeneric_drug_name(T generic_drug_name) {
		this.generic_drug_name = generic_drug_name;
	}
	public T getDose() {
		return dose;
	}
	public void setDose(T dose) {
		this.dose = dose;
	}
	public T getWay_administration() {
		return way_administration;
	}
	public void setWay_administration(T way_administration) {
		this.way_administration = way_administration;
	}
	public T getCare() {
		return care;
	}
	public void setCare(T care) {
		this.care = care;
	}
	public T getHygiene_measures_dietary() {
		return hygiene_measures_dietary;
	}
	public void setHygiene_measures_dietary(T hygiene_measures_dietary) {
		this.hygiene_measures_dietary = hygiene_measures_dietary;
	}
	public T getPreventive() {
		return preventive;
	}
	public void setPreventive(T preventive) {
		this.preventive = preventive;
	}
	public Query<T> getQuery() {
		return query;
	}
	public void setQuery(Query<T> query) {
		this.query = query;
	}
	
	
}
