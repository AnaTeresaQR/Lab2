package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class SpecificEventsBuilder extends EventsBuilder implements AbstractSpecificEventsBuilder {

    SpecificEvents events;

    public SpecificEventsBuilder() {
        events = (SpecificEvents) super.events;
    }

    @Override
    public void createUnderAgeAmount(int underAgeAmount) throws EventsException {
        if (events.getAttendeesAmount() >= underAgeAmount) {
            events.setUnderageAmount(underAgeAmount);
        } else {
            throw new EventsException("Se requiere que la cantidad de asistentes sea válida,"
                    + " y la cantidad de menores de edad menor al total de asistentes");
        }
    }

    @Override
    public SpecificEvents getSpecificEvents() {
        return events;
    }

}
