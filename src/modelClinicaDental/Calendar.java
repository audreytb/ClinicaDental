package modelClinicaDental;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Calendar <T>{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) private Long
	id;
	@Persistent private T calendar;
	@Persistent private Workplan<T> workplan;
	public Calendar(T calendar) {
		super();
		this.calendar = calendar;
	}
	public Calendar(T calendar, Workplan<T> workplan) {
		super();
		this.calendar = calendar;
		this.workplan = workplan;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public T getCalendar() {
		return calendar;
	}
	public void setCalendar(T calendar) {
		this.calendar = calendar;
	}
	public Workplan<T> getWorkplan() {
		return workplan;
	}
	public void setWorkplan(Workplan<T> workplan) {
		this.workplan = workplan;
	}
	

	
}
