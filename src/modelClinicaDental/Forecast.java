package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Forecast {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String fore_cast;
	@Persistent private String fore_castId;
	
	public Forecast() {
		super();
	}

	public Forecast(String fore_cast, String fore_castId) {
		super();
		this.fore_cast = fore_cast;
		this.fore_castId = fore_castId;
	}

	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getFore_cast() {
		return fore_cast;
	}

	public void setFore_cast(String fore_cast) {
		this.fore_cast = fore_cast;
	}

	public String getFore_castId() {
		return fore_castId;
	}

	public void setFore_castId(String fore_castId) {
		this.fore_castId = fore_castId;
	}

	@Override
	public String toString() {
		return "Forecast [key=" + key + ", fore_cast=" + fore_cast + ", fore_castId=" + fore_castId + "]";
	}
	
	
	
	
}
