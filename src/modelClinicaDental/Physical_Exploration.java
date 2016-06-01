package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Physical_Exploration {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private String vitalSigns_pa="";
	@Persistent private String vitalSigns_pulso="";
	@Persistent private String vitalSigns_temp="";
	@Persistent private String vitalSigns_fc="";
	@Persistent private String vitalSigns_frecResp="";
	@Persistent private String clinica_examination="";
	@Persistent private String odontoestomatologico="";
	
	@Persistent(mappedBy = "physical_exploration") private Query query=new Query();

	
	
	
	
	
	
}
