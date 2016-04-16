package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class SpecificEventsBuilder extends EventsBuilder {

    SpecificEvents events;

    public SpecificEventsBuilder() {
        events = new SpecificEvents();
    }

    @Override
    public void createAttendeesAmount(int attendees) throws EventsException {
        GeneralClient client = events.getClient();
        if (attendees >= 0) {
            if (client instanceof EducationalInstitution) {
                if (events.getUnderageAmount() < attendees) {
                    events.setAttendeesAmount(attendees);
                } else {
                    throw new EventsException("Se requiere que la cantidad de asistentes sea válida,"
                            + " y la cantidad de menores de edad menor al total de asistentes");
                }
            }
        } else {
            throw new EventsException("Se requiere que la cantidad de asistentes sea válida");
        }
    }

    @Override
    public GeneralEvents getEvents() {
        return events;
    }

}
