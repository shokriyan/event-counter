package mo.holiday.counter.app;

import mo.holiday.counter.model.AllEvents;
import mo.holiday.counter.model.Event;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;

public class HolidayCounterApplication {
	
	public static void main(String[] args) {
		//Application Start here. 
		
		AllEvents allEvents = new AllEvents();
		
		ArrayList<Event> events = allEvents.getAllEvents();
		
		if (!events.isEmpty()) {
			
			for (int index = 0; index < events.size(); index ++) {
				
				Event event = events.get(index);
				
				DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
				LocalDate eventDate = LocalDate.parse(event.getDate(), format);
				
				LocalDate todayDate = LocalDate.now();
				
				if (eventDate.isAfter(todayDate)) {
					
					System.out.println("Next event is " + event.getDescription());
					System.out.println("Next Event date is " + event.getDate());
					System.out.println("Next Event off days are " + event.getDaysOff());
					
					Calendar calendar = Calendar.getInstance();
					calendar.set(eventDate.getYear(), eventDate.getMonth().getValue() - 1, eventDate.getDayOfMonth());
					
					calendar.add(Calendar.DAY_OF_MONTH, event.getDaysOff());
					
					System.out.println("Next Business days after event is ::: " + calendar.getTime());
					
					break;
				}
				
			}
			
		}
		
	}

}
