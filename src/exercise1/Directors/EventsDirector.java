package exercise1.Directors;

import exercise1.AbstractEventsBuilder;
import exercise1.AbstractSpecificEventsBuilder;
import exercise1.ConcreteClients.GeneralClient;
import exercise1.EventsBuilder;
import exercise1.Exceptions.EventsException;
import exercise1.GeneralEvents;
import exercise1.SpecificEvents;
import exercise1.SpecificEventsBuilder;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class EventsDirector {

    public GeneralEvents createEvents(AbstractEventsBuilder ab,
            GeneralClient client,
            String placeEvent,
            Date date,
            int hoursAmount,
            int attendeesAmount)
            throws EventsException {

        if (ab == null) {
            ab = new EventsBuilder();
        }
        ab.createClient(client);
        ab.createPlaceEventName(placeEvent);
        ab.createDate(date);
        ab.createHoursAmount(hoursAmount);
        ab.createAttendeesAmount(attendeesAmount);

        return ab.getEvents();
    }

    public SpecificEvents createEvents(AbstractSpecificEventsBuilder ab,
            GeneralClient client,
            String placeEvent,
            Date date,
            int hoursAmount,
            int attendeesAmount, int underAgeAmount)
            throws EventsException {

        if (ab == null) {
            ab = new SpecificEventsBuilder();
        }
        ab.createClient(client);
        ab.createPlaceEventName(placeEvent);
        ab.createDate(date);
        ab.createHoursAmount(hoursAmount);
        ab.createAttendeesAmount(attendeesAmount);
        ab.createUnderAgeAmount(underAgeAmount);

        return (SpecificEvents) ab.getEvents();
    }
}
