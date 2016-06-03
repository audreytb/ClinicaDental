package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import java.util.ArrayList;
import java.util.List;
import javax.jdo.annotations.Extension;
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Patient {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
    
    
	@Persistent private String name;
	
	@Persistent private int number_historia_clinica;
	@Persistent private String number_dni;
	
	@Persistent private int date_time_care;
	@Persistent private int opening_date_medical_history;
	@Persistent private String sex;
	@Persistent private int age;
	@Persistent private String birthplace;
	@Persistent private int birthdate;
	@Persistent private String degree_instruction;
	@Persistent private String race;
	@Persistent private String occupation;
	@Persistent private String religion;
	@Persistent private String cvil_status;
	@Persistent private String place_origin;
	@Persistent private String current_address;
	@Persistent private String name_lastName_companion;
	
	
	
	
	//private int[] hola=new int[2];
		//(T[]) new Object[capacidad];
		//private List<Color> color = new ArrayList<Color>();
		//@Persistent private Query<T>[] query=(Query<T>[]) new Object[2];
	@Persistent private Dentist dentista;
	@Persistent(mappedBy = "patient") private List<Query> query;
	
	
	public Patient() {
		super();
	}
	
	
	
	public Patient(String name, int number_historia_clinica, String number_dni, int date_time_care,
			int opening_date_medical_history, String sex, int age, String birthplace, int birthdate,
			String degree_instruction, String race, String occupation, String religion, String cvil_status,
			String place_origin, String current_address, String name_lastName_companion) {
		super();
		this.name = name;
		this.number_historia_clinica = number_historia_clinica;
		this.number_dni = number_dni;
		this.date_time_care = date_time_care;
		this.opening_date_medical_history = opening_date_medical_history;
		this.sex = sex;
		this.age = age;
		this.birthplace = birthplace;
		this.birthdate = birthdate;
		this.degree_instruction = degree_instruction;
		this.race = race;
		this.occupation = occupation;
		this.religion = religion;
		this.cvil_status = cvil_status;
		this.place_origin = place_origin;
		this.current_address = current_address;
		this.name_lastName_companion = name_lastName_companion;
	}



	public Patient(String name, int number_historia_clinica, String number_dni, int date_time_care,
			int opening_date_medical_history, String sex, int age, String birthplace, int birthdate,
			String degree_instruction, String race, String occupation, String religion, String cvil_status,
			String place_origin, String current_address, String name_lastName_companion, Dentist dentista) {
		super();
		this.name = name;
		this.number_historia_clinica = number_historia_clinica;
		this.number_dni = number_dni;
		this.date_time_care = date_time_care;
		this.opening_date_medical_history = opening_date_medical_history;
		this.sex = sex;
		this.age = age;
		this.birthplace = birthplace;
		this.birthdate = birthdate;
		this.degree_instruction = degree_instruction;
		this.race = race;
		this.occupation = occupation;
		this.religion = religion;
		this.cvil_status = cvil_status;
		this.place_origin = place_origin;
		this.current_address = current_address;
		this.name_lastName_companion = name_lastName_companion;
		this.dentista = dentista;
	}
	public Patient(String name, int number_historia_clinica, String number_dni, int date_time_care,
			int opening_date_medical_history, String sex, int age, String birthplace, int birthdate,
			String degree_instruction, String race, String occupation, String religion, String cvil_status,
			String place_origin, String current_address, String name_lastName_companion, Dentist dentista,
			List<Query> query) {
		super();
		this.name = name;
		this.number_historia_clinica = number_historia_clinica;
		this.number_dni = number_dni;
		this.date_time_care = date_time_care;
		this.opening_date_medical_history = opening_date_medical_history;
		this.sex = sex;
		this.age = age;
		this.birthplace = birthplace;
		this.birthdate = birthdate;
		this.degree_instruction = degree_instruction;
		this.race = race;
		this.occupation = occupation;
		this.religion = religion;
		this.cvil_status = cvil_status;
		this.place_origin = place_origin;
		this.current_address = current_address;
		this.name_lastName_companion = name_lastName_companion;
		this.dentista = dentista;
		this.query = query;
	}
	
	

	


	



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber_historia_clinica() {
		return number_historia_clinica;
	}
	public void setNumber_historia_clinica(int number_historia_clinica) {
		this.number_historia_clinica = number_historia_clinica;
	}
	public String getNumber_dni() {
		return number_dni;
	}
	public void setNumber_dni(String number_dni) {
		this.number_dni = number_dni;
	}
	public int getDate_time_care() {
		return date_time_care;
	}
	public void setDate_time_care(int date_time_care) {
		this.date_time_care = date_time_care;
	}
	public int getOpening_date_medical_history() {
		return opening_date_medical_history;
	}
	public void setOpening_date_medical_history(int opening_date_medical_history) {
		this.opening_date_medical_history = opening_date_medical_history;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public int getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(int birthdate) {
		this.birthdate = birthdate;
	}
	public String getDegree_instruction() {
		return degree_instruction;
	}
	public void setDegree_instruction(String degree_instruction) {
		this.degree_instruction = degree_instruction;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCvil_status() {
		return cvil_status;
	}
	public void setCvil_status(String cvil_status) {
		this.cvil_status = cvil_status;
	}
	public String getPlace_origin() {
		return place_origin;
	}
	public void setPlace_origin(String place_origin) {
		this.place_origin = place_origin;
	}
	public String getCurrent_address() {
		return current_address;
	}
	public void setCurrent_address(String current_address) {
		this.current_address = current_address;
	}
	public String getName_lastName_companion() {
		return name_lastName_companion;
	}
	public void setName_lastName_companion(String name_lastName_companion) {
		this.name_lastName_companion = name_lastName_companion;
	}
	public Dentist getDentista() {
		return dentista;
	}
	public void setDentista(Dentist dentista) {
		this.dentista = dentista;
	}
	public List<Query> getQuery() {
		return query;
	}
	public void setQuery(List<Query> query) {
		this.query = query;
	}



	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", number_historia_clinica=" + number_historia_clinica
				+ ", number_dni=" + number_dni + ", date_time_care=" + date_time_care
				+ ", opening_date_medical_history=" + opening_date_medical_history + ", sex=" + sex + ", age=" + age
				+ ", birthplace=" + birthplace + ", birthdate=" + birthdate + ", degree_instruction="
				+ degree_instruction + ", race=" + race + ", occupation=" + occupation + ", religion=" + religion
				+ ", cvil_status=" + cvil_status + ", place_origin=" + place_origin + ", current_address="
				+ current_address + ", name_lastName_companion=" + name_lastName_companion + ", dentista=" + dentista
				+ ", query=" + query + "]";
	}



	



	






	




	

	
	
	
	
	
	
	
}