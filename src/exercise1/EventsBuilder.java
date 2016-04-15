package exercise1;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class EventsBuilder implements AbstractEventsBuilder {

    GeneralEvents events;

    public EventsBuilder() {
        events = new GeneralEvents();
    }

    @Override
    public void createClient(GeneralClient client) throws EventsException {
        if (client != null) {
            events.setClient(client);
        } else {
            throw new EventsException("No es posible la creación del cliente");
        }
    }

    @Override
    public void createPlaceEventName(String newPlaceName) throws EventsException {
        if (newPlaceName != null && !newPlaceName.equals("")) {
            events.setPlaceEvent(newPlaceName);
        } else {
            throw new EventsException("Se requiere un nombre de lugar para realizar el evento");
        }
    }

    @Override
    public void createDate(Date date) throws EventsException {
        if (date != null) {
            events.setDate(date);
        } else {
            throw new EventsException("Se requiere una fecha para el evento");
        }
    }

    @Override
    public void createHoursAmount(int hours) throws EventsException {
        if (hours >= 1) {
            events.setHoursAmount(hours);
        } else {
            throw new EventsException("Las horas del evento deben ser mayores a 1");
        }
    }

    @Override
    public void createAttendeesAmount(int attendees) throws EventsException {
        GeneralClient client = events.getClient();
        if (attendees >= 0) {
            events.setAttendeesAmount(attendees);
        } else {
            throw new EventsException("Se requiere que la cantidad de asistentes sea válida");
        }
    }

    @Override
    public GeneralEvents getEvents() {
        return events;
    }

}
