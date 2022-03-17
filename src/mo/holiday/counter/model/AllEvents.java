package mo.holiday.counter.model;

import java.util.ArrayList;

public class AllEvents {

	// Using Arraylist.
	// private Event[] events;

	private ArrayList<Event> events;

	// Constructor to Create All the events.

	public AllEvents() {

		Event one = new Event("01/01/2022", 1, "New Year");
		Event two = new Event("01/17/2022", 1, "Martin Luther King");
		Event three = new Event("02/21/2022", 1, "President Day");
		Event four = new Event("03/08/2022", 0, "Womens days");
		
		this.events = new ArrayList<Event>();
		events.add(one);
		events.add(two);
		events.add(three);
		events.add(four);

	}

	/**
	 * Functions is to return the list of events.
	 */

	public ArrayList<Event> getAllEvents() {

		if (this.events.isEmpty()) {
			return new ArrayList<Event>();
		}
		
		return this.events;

	}

}
