package mo.holiday.counter.model;

public class Event {

	private String date;
	private int daysOff;
	private String description;
	
	public Event(String date, int daysOff, String description) {
		this.date = date; 
		this.daysOff = daysOff;
		this.description = description;
		
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return this.date;
	}

	public int getDaysOff() {
		return daysOff;
	}

	public void setDaysOff(int daysOff) {
		this.daysOff = daysOff;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
