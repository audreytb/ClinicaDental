package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

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


	


	


	
	
	
	
	
	
	
}
