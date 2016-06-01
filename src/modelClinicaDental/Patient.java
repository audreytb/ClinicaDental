package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

import java.util.ArrayList;
import java.util.List;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Patient {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String name;
	@Persistent private String last_name;
	@Persistent private int number_historia_clinica;
	@Persistent private int number_dni;
	
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
	
	@Persistent private Dentist dentista=new Dentist();
	//private int[] hola=new int[2];
		//(T[]) new Object[capacidad];
		//private List<Color> color = new ArrayList<Color>();
		//@Persistent private Query<T>[] query=(Query<T>[]) new Object[2];
	
	@Persistent(mappedBy = "patient")
	private List<Query> query= new ArrayList <Query>();
	
	
	
	
	
	
}