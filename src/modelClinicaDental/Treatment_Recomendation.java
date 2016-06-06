package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Treatment_Recomendation {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String treatmentRecomendations;
	@Persistent private String generic_drug_name;
	@Persistent private String dose;
	@Persistent private String way_administration;
	@Persistent private String care;
	@Persistent private String hygiene_measures_dietary;
	@Persistent private String preventive;
	@Persistent private String treament_recomendationId;

	
	public Treatment_Recomendation() {
		
	}


	public Treatment_Recomendation(String treatmentRecomendations, String generic_drug_name, String dose,
			String way_administration, String care, String hygiene_measures_dietary, String preventive,
			String treament_recomendationId) {
		super();
		this.treatmentRecomendations = treatmentRecomendations;
		this.generic_drug_name = generic_drug_name;
		this.dose = dose;
		this.way_administration = way_administration;
		this.care = care;
		this.hygiene_measures_dietary = hygiene_measures_dietary;
		this.preventive = preventive;
		this.treament_recomendationId = treament_recomendationId;
	}


	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}


	public void setKey(Key key) {
		this.key = key;
	}


	public String getTreatmentRecomendations() {
		return treatmentRecomendations;
	}


	public void setTreatmentRecomendations(String treatmentRecomendations) {
		this.treatmentRecomendations = treatmentRecomendations;
	}


	public String getGeneric_drug_name() {
		return generic_drug_name;
	}


	public void setGeneric_drug_name(String generic_drug_name) {
		this.generic_drug_name = generic_drug_name;
	}


	public String getDose() {
		return dose;
	}


	public void setDose(String dose) {
		this.dose = dose;
	}


	public String getWay_administration() {
		return way_administration;
	}


	public void setWay_administration(String way_administration) {
		this.way_administration = way_administration;
	}


	public String getCare() {
		return care;
	}


	public void setCare(String care) {
		this.care = care;
	}


	public String getHygiene_measures_dietary() {
		return hygiene_measures_dietary;
	}


	public void setHygiene_measures_dietary(String hygiene_measures_dietary) {
		this.hygiene_measures_dietary = hygiene_measures_dietary;
	}


	public String getPreventive() {
		return preventive;
	}


	public void setPreventive(String preventive) {
		this.preventive = preventive;
	}


	public String getTreament_recomendationId() {
		return treament_recomendationId;
	}


	public void setTreament_recomendationId(String treament_recomendationId) {
		this.treament_recomendationId = treament_recomendationId;
	}


	@Override
	public String toString() {
		return "Treatment_Recomendation [key=" + key + ", treatmentRecomendations=" + treatmentRecomendations
				+ ", generic_drug_name=" + generic_drug_name + ", dose=" + dose + ", way_administration="
				+ way_administration + ", care=" + care + ", hygiene_measures_dietary=" + hygiene_measures_dietary
				+ ", preventive=" + preventive + ", treament_recomendationId=" + treament_recomendationId + "]";
	}
	
	
	
}
