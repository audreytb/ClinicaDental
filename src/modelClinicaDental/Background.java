package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Background<T> {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	private Key key;
	@Persistent private T family_background;
	@Persistent private T personal_history;
	@Persistent private Query<T> query;
	public Background() {
		super();
	}

	public Background(T family_background, T personal_history, Query<T> query) {
		super();
		this.family_background = family_background;
		this.personal_history = personal_history;
		this.query = query;
	}
	
	
	public T getFamily_background() {
		return family_background;
	}
	public void setFamily_background(T family_background) {
		this.family_background = family_background;
	}
	public T getPersonal_history() {
		return personal_history;
	}
	public void setPersonal_history(T personal_history) {
		this.personal_history = personal_history;
	}
	public Query<T> getQuery() {
		return query;
	}
	public void setQuery(Query<T> query) {
		this.query = query;
	}
	
	
	
	
	
}
