package exercise1;

import java.util.Calendar;
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

                GeneralEvents ge = eventsDirector.createEvents(aeb, gc, "San Ramón", createDate(2016, 6, 29), 4, 20);
                System.out.println("" + ge.toString());
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
