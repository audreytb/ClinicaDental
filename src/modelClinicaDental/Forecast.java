package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Forecast <T>{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T fore_cast;
	@Persistent private Query<T> query;
	public Forecast(T fore_cast, Query<T> query) {
		super();
		this.fore_cast = fore_cast;
		this.query = query;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public T getFore_cast() {
		return fore_cast;
	}
	public void setFore_cast(T fore_cast) {
		this.fore_cast = fore_cast;
	}
	public Query<T> getQuery() {
		return query;
	}
	public void setQuery(Query<T> query) {
		this.query = query;
	}
	
	
	
	}
