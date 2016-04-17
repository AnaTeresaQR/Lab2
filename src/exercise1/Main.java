package exercise1;

import exercise1.ConcreteClients.GeneralClient;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
        try {
            AbstractEventsBuilder aeb = new EventsBuilder();
            AbstractSpecificEventsBuilder aeb2 = new SpecificEventsBuilder();

            EventsDirector eventsDirector = new EventsDirector();

            Person person = new Person("207410170", "Ana", "Teresa", "Quesada", "Ramírez");
            Person person2 = new Person("206710170", "Zulay", "Mayela", "Ramírez", "Herrera");
            Person person3 = new Person("202410876", "Chester", "Antonio", "Quesada", "Ramírez");
            Person person4 = new Person("203450560", "Tomás", "Osvaldo", "Quesada", "Murillo");

            ClientGroupFactory cf = new GovernmentEntity_ClientFactory();
            ClientGroupFactory cf2 = new EducationalInstitution_ClientFactory();

            GeneralClient gc = cf.createClient("Entidad Gubernamental", "tel de oficina", "24536789", person);
            GeneralClient gc2 = cf2.createClient("Institución Educativa", "tel del director de la institución", "24475689", person2);

            try {

                GeneralEvents ge = eventsDirector.createEvents(aeb, gc, "San Ramón", createDate(2016, 6, 29), 4, 20);
                SpecificEvents ge2 = (SpecificEvents) eventsDirector.createEvents(aeb2, gc2, "Palmares", createDate(2016, 8, 15), 5, 30, 15);

                System.out.println("" + ge.toString());
                System.out.println("" + ge2.toString());
            } catch (EventsException ex) {
                System.out.println("" + ex.getMessage());
            }

        } catch (ClientException ex) {
            System.out.println("" + ex.getMessage());
        }
    }

    public static Date createDate(int year, int month, int date) {
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, date);
        return c.getTime();
    }
}
