package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Odontograma {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private String odontogram;
	@Persistent private String odontogramaId;
	public Odontograma() {
		super();
	}
	public Odontograma(String odontogram, String odontogramaId) {
		super();
		this.odontogram = odontogram;
		this.odontogramaId = odontogramaId;
	}
	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public String getOdontogram() {
		return odontogram;
	}
	public void setOdontogram(String odontogram) {
		this.odontogram = odontogram;
	}
	public String getOdontogramaId() {
		return odontogramaId;
	}
	public void setOdontogramaId(String odontogramaId) {
		this.odontogramaId = odontogramaId;
	}
	@Override
	public String toString() {
		return "Odontograma [key=" + key + ", odontogram=" + odontogram + ", odontogramaId=" + odontogramaId + "]";
	}
	
	
	
	
}
