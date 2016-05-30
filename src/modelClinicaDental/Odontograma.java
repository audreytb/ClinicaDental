package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Odontograma <T>{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T odontogram;
	@Persistent private Query<T> query;
	public Odontograma(T odontogram, Query<T> query) {
		super();
		this.odontogram = odontogram;
		this.query = query;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public T getOdontogram() {
		return odontogram;
	}
	public void setOdontogram(T odontogram) {
		this.odontogram = odontogram;
	}
	public Query<T> getQuery() {
		return query;
	}
	public void setQuery(Query<T> query) {
		this.query = query;
	}
	
	
	
}
