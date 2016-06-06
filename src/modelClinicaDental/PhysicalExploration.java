package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class PhysicalExploration {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String vitalSigns_pa;
	@Persistent private String vitalSigns_pulso;
	@Persistent private String vitalSigns_temp;
	@Persistent private String vitalSigns_fc;
	@Persistent private String vitalSigns_frecResp;
	@Persistent private String clinica_examination;
	@Persistent private String odontoestomatologico;
	@Persistent private String physical_explorationId;
	
	
	
	public PhysicalExploration() {
		super();
	}



	public PhysicalExploration(String vitalSigns_pa, String vitalSigns_pulso, String vitalSigns_temp,
			String vitalSigns_fc, String vitalSigns_frecResp, String clinica_examination, String odontoestomatologico,
			String physical_explorationId) {
		super();
		this.vitalSigns_pa = vitalSigns_pa;
		this.vitalSigns_pulso = vitalSigns_pulso;
		this.vitalSigns_temp = vitalSigns_temp;
		this.vitalSigns_fc = vitalSigns_fc;
		this.vitalSigns_frecResp = vitalSigns_frecResp;
		this.clinica_examination = clinica_examination;
		this.odontoestomatologico = odontoestomatologico;
		this.physical_explorationId = physical_explorationId;
	}



	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}



	public void setKey(Key key) {
		this.key = key;
	}



	public String getVitalSigns_pa() {
		return vitalSigns_pa;
	}



	public void setVitalSigns_pa(String vitalSigns_pa) {
		this.vitalSigns_pa = vitalSigns_pa;
	}



	public String getVitalSigns_pulso() {
		return vitalSigns_pulso;
	}



	public void setVitalSigns_pulso(String vitalSigns_pulso) {
		this.vitalSigns_pulso = vitalSigns_pulso;
	}



	public String getVitalSigns_temp() {
		return vitalSigns_temp;
	}



	public void setVitalSigns_temp(String vitalSigns_temp) {
		this.vitalSigns_temp = vitalSigns_temp;
	}



	public String getVitalSigns_fc() {
		return vitalSigns_fc;
	}



	public void setVitalSigns_fc(String vitalSigns_fc) {
		this.vitalSigns_fc = vitalSigns_fc;
	}



	public String getVitalSigns_frecResp() {
		return vitalSigns_frecResp;
	}



	public void setVitalSigns_frecResp(String vitalSigns_frecResp) {
		this.vitalSigns_frecResp = vitalSigns_frecResp;
	}



	public String getClinica_examination() {
		return clinica_examination;
	}



	public void setClinica_examination(String clinica_examination) {
		this.clinica_examination = clinica_examination;
	}



	public String getOdontoestomatologico() {
		return odontoestomatologico;
	}



	public void setOdontoestomatologico(String odontoestomatologico) {
		this.odontoestomatologico = odontoestomatologico;
	}



	public String getPhysical_explorationId() {
		return physical_explorationId;
	}



	public void setPhysical_explorationId(String physical_explorationId) {
		this.physical_explorationId = physical_explorationId;
	}



	@Override
	public String toString() {
		return "PhysicalExploration [key=" + key + ", vitalSigns_pa=" + vitalSigns_pa + ", vitalSigns_pulso="
				+ vitalSigns_pulso + ", vitalSigns_temp=" + vitalSigns_temp + ", vitalSigns_fc=" + vitalSigns_fc
				+ ", vitalSigns_frecResp=" + vitalSigns_frecResp + ", clinica_examination=" + clinica_examination
				+ ", odontoestomatologico=" + odontoestomatologico + ", physical_explorationId="
				+ physical_explorationId + "]";
	}


	
	
	
	
	
	
}
