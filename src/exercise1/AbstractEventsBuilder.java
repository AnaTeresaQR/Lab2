package exercise1;

import exercise1.ConcreteClients.GeneralClient;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public interface AbstractEventsBuilder {

    public void createClient(GeneralClient client) throws EventsException;

    public void createPlaceEventName(String newPlaceName) throws EventsException;

    public void createDate(Date date) throws EventsException;

    public void createHoursAmount(int hours) throws EventsException;

    public void createAttendeesAmount(int attendees) throws EventsException;

    public GeneralEvents getEvents();

}
