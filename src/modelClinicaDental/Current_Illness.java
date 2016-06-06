package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Current_Illness {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String enfermedad_actual;

	@Persistent private String data_reporting;
	@Persistent private String reason_consultation;
	@Persistent private String sick_time;
	@Persistent private String signs_symptoms_main;
	@Persistent private String chronological_story;
	@Persistent private String biological_functions;
	@Persistent private String current_illnesId;
	
	
	public Current_Illness() {
		super();
	}


	public Current_Illness(String data_reporting, String reason_consultation, String sick_time,
			String signs_symptoms_main, String chronological_story, String biological_functions) {
		super();
		this.data_reporting = data_reporting;
		this.reason_consultation = reason_consultation;
		this.sick_time = sick_time;
		this.signs_symptoms_main = signs_symptoms_main;
		this.chronological_story = chronological_story;
		this.biological_functions = biological_functions;
	}


	public Current_Illness(String data_reporting, String reason_consultation, String sick_time,
			String signs_symptoms_main, String chronological_story, String biological_functions,
			String current_illnesId) {
		super();
		this.data_reporting = data_reporting;
		this.reason_consultation = reason_consultation;
		this.sick_time = sick_time;
		this.signs_symptoms_main = signs_symptoms_main;
		this.chronological_story = chronological_story;
		this.biological_functions = biological_functions;
		this.current_illnesId = current_illnesId;
	}


	@Override
	public String toString() {
		return "Current_Illness [key=" + key + ", enfermedad_actual=" + enfermedad_actual + ", data_reporting="
				+ data_reporting + ", reason_consultation=" + reason_consultation + ", sick_time=" + sick_time
				+ ", signs_symptoms_main=" + signs_symptoms_main + ", chronological_story=" + chronological_story
				+ ", biological_functions=" + biological_functions + ", current_illnesId=" + current_illnesId + "]";
	}


	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}


	public void setKey(Key key) {
		this.key = key;
	}


	public String getEnfermedad_actual() {
		return enfermedad_actual;
	}


	public void setEnfermedad_actual(String enfermedad_actual) {
		this.enfermedad_actual = enfermedad_actual;
	}


	public String getData_reporting() {
		return data_reporting;
	}


	public void setData_reporting(String data_reporting) {
		this.data_reporting = data_reporting;
	}


	public String getReason_consultation() {
		return reason_consultation;
	}


	public void setReason_consultation(String reason_consultation) {
		this.reason_consultation = reason_consultation;
	}


	public String getSick_time() {
		return sick_time;
	}


	public void setSick_time(String sick_time) {
		this.sick_time = sick_time;
	}


	public String getSigns_symptoms_main() {
		return signs_symptoms_main;
	}


	public void setSigns_symptoms_main(String signs_symptoms_main) {
		this.signs_symptoms_main = signs_symptoms_main;
	}


	public String getChronological_story() {
		return chronological_story;
	}


	public void setChronological_story(String chronological_story) {
		this.chronological_story = chronological_story;
	}


	public String getBiological_functions() {
		return biological_functions;
	}


	public void setBiological_functions(String biological_functions) {
		this.biological_functions = biological_functions;
	}


	public String getCurrent_illnesId() {
		return current_illnesId;
	}


	public void setCurrent_illnesId(String current_illnesId) {
		this.current_illnesId = current_illnesId;
	}


	


	


	
	
	
	
	
	
	
}
