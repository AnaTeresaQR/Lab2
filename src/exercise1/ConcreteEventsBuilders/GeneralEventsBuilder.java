package exercise1.ConcreteEventsBuilders;

import exercise1.AbstractEventsBuilders.AbstractEventsBuilder;
import exercise1.Exceptions.EventsException;
import exercise1.ConcreteClients.GeneralClient;
import exercise1.FactoryStrategy.InterfaceSelectStrategy;
import exercise1.FactoryStrategy.SelectStrategy;
import exercise1.ProductEventsBuilders.GeneralEvents;
import exercise1.ProductEventsBuilders.SpecificEvents;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class GeneralEventsBuilder implements AbstractEventsBuilder {
    
    GeneralEvents events;
    
    public GeneralEventsBuilder() {
        events = new SpecificEvents();
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
    
    @Override
    public void createPrice() {
        SelectStrategy select = new SelectStrategy();
        events.setStrategy(select.chooseStrategy(events.getClient()));
        double price = events.getStrategy().gain(events);
        
        events.setPrice(price);
    }
    
}
