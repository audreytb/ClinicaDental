package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Patient <T>{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T name;
	@Persistent private T last_name;
	@Persistent private T number_historia_clinica;
	@Persistent private T number_dni;
	
	@Persistent private T date_time_care;
	@Persistent private T opening_date_medical_history;
	@Persistent private T sex;
	@Persistent private T age;
	@Persistent private T birthplace;
	@Persistent private T birthdate;
	@Persistent private T degree_instruction;
	@Persistent private T race;
	@Persistent private T occupation;
	@Persistent private T religion;
	@Persistent private T cvil_status;
	@Persistent private T place_origin;
	@Persistent private T current_address;
	@Persistent private T name_lastName_companion;
	
	@Persistent private Dentist<T> dentista;
	@Persistent private Query<T> [] query;
	public Patient(T name, T last_name, T number_historia_clinica, T number_dni, T date_time_care,
			T opening_date_medical_history, T sex, T age, T birthplace, T birthdate, T degree_instruction, T race,
			T occupation, T religion, T cvil_status, T place_origin, T current_address, T name_lastName_companion,
			Dentist<T> dentista) {
		super();
		this.name = name;
		this.last_name = last_name;
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
	public Patient(T name, T last_name, T number_historia_clinica, T number_dni, T date_time_care,
			T opening_date_medical_history, T sex, T age, T birthplace, T birthdate, T degree_instruction, T race,
			T occupation, T religion, T cvil_status, T place_origin, T current_address, T name_lastName_companion,
			Dentist<T> dentista, Query<T>[] query) {
		super();
		this.name = name;
		this.last_name = last_name;
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
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getLast_name() {
		return last_name;
	}
	public void setLast_name(T last_name) {
		this.last_name = last_name;
	}
	public T getNumber_historia_clinica() {
		return number_historia_clinica;
	}
	public void setNumber_historia_clinica(T number_historia_clinica) {
		this.number_historia_clinica = number_historia_clinica;
	}
	public T getNumber_dni() {
		return number_dni;
	}
	public void setNumber_dni(T number_dni) {
		this.number_dni = number_dni;
	}
	public T getDate_time_care() {
		return date_time_care;
	}
	public void setDate_time_care(T date_time_care) {
		this.date_time_care = date_time_care;
	}
	public T getOpening_date_medical_history() {
		return opening_date_medical_history;
	}
	public void setOpening_date_medical_history(T opening_date_medical_history) {
		this.opening_date_medical_history = opening_date_medical_history;
	}
	public T getSex() {
		return sex;
	}
	public void setSex(T sex) {
		this.sex = sex;
	}
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	public T getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(T birthplace) {
		this.birthplace = birthplace;
	}
	public T getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(T birthdate) {
		this.birthdate = birthdate;
	}
	public T getDegree_instruction() {
		return degree_instruction;
	}
	public void setDegree_instruction(T degree_instruction) {
		this.degree_instruction = degree_instruction;
	}
	public T getRace() {
		return race;
	}
	public void setRace(T race) {
		this.race = race;
	}
	public T getOccupation() {
		return occupation;
	}
	public void setOccupation(T occupation) {
		this.occupation = occupation;
	}
	public T getReligion() {
		return religion;
	}
	public void setReligion(T religion) {
		this.religion = religion;
	}
	public T getCvil_status() {
		return cvil_status;
	}
	public void setCvil_status(T cvil_status) {
		this.cvil_status = cvil_status;
	}
	public T getPlace_origin() {
		return place_origin;
	}
	public void setPlace_origin(T place_origin) {
		this.place_origin = place_origin;
	}
	public T getCurrent_address() {
		return current_address;
	}
	public void setCurrent_address(T current_address) {
		this.current_address = current_address;
	}
	public T getName_lastName_companion() {
		return name_lastName_companion;
	}
	public void setName_lastName_companion(T name_lastName_companion) {
		this.name_lastName_companion = name_lastName_companion;
	}
	public Dentist<T> getDentista() {
		return dentista;
	}
	public void setDentista(Dentist<T> dentista) {
		this.dentista = dentista;
	}
	public Query<T>[] getQuery() {
		return query;
	}
	public void setQuery(Query<T>[] query) {
		this.query = query;
	}
	
	
	

	
	
	
	
	
}