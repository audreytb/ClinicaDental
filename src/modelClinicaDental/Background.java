package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Background {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	
	
	@Persistent private String family_background;
	@Persistent private String personal_history;
	@Persistent private String backgroundId;
	
	public Background() {
		
	}

	public Background(String family_background, String personal_history, String backgroundId) {
		super();
		this.family_background = family_background;
		this.personal_history = personal_history;
		this.backgroundId = backgroundId;
	}

	public String getKey() {
		return KeyFactory.keyToString(this.key);
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public String getFamily_background() {
		return family_background;
	}

	public void setFamily_background(String family_background) {
		this.family_background = family_background;
	}

	public String getPersonal_history() {
		return personal_history;
	}

	public void setPersonal_history(String personal_history) {
		this.personal_history = personal_history;
	}

	public String getBackgroundId() {
		return backgroundId;
	}

	public void setBackgroundId(String backgroundId) {
		this.backgroundId = backgroundId;
	}

	@Override
	public String toString() {
		return "Background [key=" + key + ", family_background=" + family_background + ", personal_history="
				+ personal_history + ", backgroundId=" + backgroundId + "]";
	}

	
	
	
	
	
	
}
