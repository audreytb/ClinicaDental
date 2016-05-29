package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Background<T> {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T family_background;
	@Persistent private T personal_history;
	public Background(T family_background, T personal_history) {
		super();

		this.family_background = family_background;
		this.personal_history = personal_history;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	
	
}
