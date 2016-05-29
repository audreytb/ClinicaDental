package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Physical_exploration<T> {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T vitalSigns_pa;
	@Persistent private T vitalSigns_pulso;
	@Persistent private T vitalSigns_temp;
	@Persistent private T vitalSigns_fc;
	@Persistent private T vitalSigns_frecResp;
	@Persistent private T clinica_examination;
	@Persistent private T odontoestomatologico;
	public Physical_exploration(T vitalSigns_pa, T vitalSigns_pulso, T vitalSigns_temp, T vitalSigns_fc,
			T vitalSigns_frecResp, T clinica_examination, T odontoestomatologico) {
		super();

		this.vitalSigns_pa = vitalSigns_pa;
		this.vitalSigns_pulso = vitalSigns_pulso;
		this.vitalSigns_temp = vitalSigns_temp;
		this.vitalSigns_fc = vitalSigns_fc;
		this.vitalSigns_frecResp = vitalSigns_frecResp;
		this.clinica_examination = clinica_examination;
		this.odontoestomatologico = odontoestomatologico;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public T getVitalSigns_pa() {
		return vitalSigns_pa;
	}
	public void setVitalSigns_pa(T vitalSigns_pa) {
		this.vitalSigns_pa = vitalSigns_pa;
	}
	public T getVitalSigns_pulso() {
		return vitalSigns_pulso;
	}
	public void setVitalSigns_pulso(T vitalSigns_pulso) {
		this.vitalSigns_pulso = vitalSigns_pulso;
	}
	public T getVitalSigns_temp() {
		return vitalSigns_temp;
	}
	public void setVitalSigns_temp(T vitalSigns_temp) {
		this.vitalSigns_temp = vitalSigns_temp;
	}
	public T getVitalSigns_fc() {
		return vitalSigns_fc;
	}
	public void setVitalSigns_fc(T vitalSigns_fc) {
		this.vitalSigns_fc = vitalSigns_fc;
	}
	public T getVitalSigns_frecResp() {
		return vitalSigns_frecResp;
	}
	public void setVitalSigns_frecResp(T vitalSigns_frecResp) {
		this.vitalSigns_frecResp = vitalSigns_frecResp;
	}
	public T getClinica_examination() {
		return clinica_examination;
	}
	public void setClinica_examination(T clinica_examination) {
		this.clinica_examination = clinica_examination;
	}
	public T getOdontoestomatologico() {
		return odontoestomatologico;
	}
	public void setOdontoestomatologico(T odontoestomatologico) {
		this.odontoestomatologico = odontoestomatologico;
	}
	
	
}
