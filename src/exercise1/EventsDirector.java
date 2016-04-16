package exercise1;

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
