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
    public void createClient(GeneralClient client) throws EventsException {
        String InstitutionName = client.getInstitutionName();
        String contactTel = client.getContactTel();
        String TelDescription = client.getTelDescription();
        Person personApplying = client.getPersonApplying();

        if ((InstitutionName != null && !InstitutionName.equals(""))
                && (contactTel != null && !contactTel.equals(""))
                && (TelDescription != null && !TelDescription.equals(""))
                && (createPerson(personApplying))) {
            events.setClient(client);
        } else {
            throw new EventsException("No es posible la creación del cliente");
        }
    }

    private boolean createPerson(Person person) throws EventsException {
        if (person == null) {
            throw new EventsException("La personas no puede ser creada porque no existe");
        } else {
            String schedule = person.getSchedule();
            String name = person.getName();
            String secondName = person.getSecondName();
            String lastName = person.getLastName();
            String secondLastName = person.getSecondLastName();

            if ((schedule != null && !schedule.equals(""))
                    && (name != null && !name.equals(""))
                    && (secondName != null && !secondName.equals(""))
                    && (lastName != null && !lastName.equals(""))
                    && (secondLastName != null && !secondLastName.equals(""))) {

                return true;
            } else {
                throw new EventsException("La personas no puede ser creada");
            }
        }
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
