package exercise1.Directors;

import exercise1.AbstractEventsBuilders.AbstractEventsBuilder;
import exercise1.AbstractEventsBuilders.AbstractSpecificEventsBuilder;
import exercise1.ConcreteClients.GeneralClient;
import exercise1.Exceptions.EventsException;
import exercise1.ProductEventsBuilders.GeneralEvents;
import exercise1.ConcreteEventsBuilders.GeneralEventsBuilder;
import exercise1.ProductEventsBuilders.SpecificEvents;
import exercise1.ConcreteEventsBuilders.SpecificEventsBuilder;
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
            ab = new GeneralEventsBuilder();
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
