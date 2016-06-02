package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Treatment_Recomendation {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private String treatmentRecomendations;
	@Persistent private String generic_drug_name;
	@Persistent private String dose;
	@Persistent private String way_administration;
	@Persistent private String care;
	@Persistent private String hygiene_measures_dietary;
	@Persistent private String preventive;

	
	public Treatment_Recomendation() {
		
	}
	
	
	
}
