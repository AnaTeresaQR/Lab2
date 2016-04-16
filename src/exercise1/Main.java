package exercise1;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("207410170", "Ana", "Teresa", "Quesada", "Ramírez");
            ClientFactory cf = new GovernmentEntity_ClientFactory();

            GeneralClient gc = cf.createClient("Entidad Gubernamental", "tel de oficina", "24536789", person);

            AbstractEventsBuilder aeb = new EventsBuilder();
            EventsDirector eventsDirector = new EventsDirector();
            try {
                GeneralEvents ge = eventsDirector.createEvents(aeb, gc, "San Ramón", new Date(29, 6, 2016), 4, 20);
                System.out.println("" + ge.toString());
            } catch (EventsException ex) {
                System.out.println("" + ex.getMessage());
            }

        } catch (ClientException ex) {
            System.out.println("" + ex.getMessage());
        }
    }
}
