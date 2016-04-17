package exercise1;

import exercise1.ConcreteClients.GeneralClient;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class GeneralEvents {

    private GeneralClient client;
    private String placeEvent;
    private Date date;
    private int hoursAmount;
    private int attendeesAmount;

    public GeneralEvents() {
    }

    public GeneralEvents(GeneralClient client, String placeEvent, Date date, int hoursAmount, int attendeesAmount) {
        this.client = client;
        this.placeEvent = placeEvent;
        this.date = date;
        this.hoursAmount = hoursAmount;
        this.attendeesAmount = attendeesAmount;
    }

    public GeneralClient getClient() {
        return client;
    }

    public void setClient(GeneralClient client) {
        this.client = client;
    }

    public String getPlaceEvent() {
        return placeEvent;
    }

    public void setPlaceEvent(String placeEvent) {
        this.placeEvent = placeEvent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHoursAmount() {
        return hoursAmount;
    }

    public void setHoursAmount(int hoursAmount) {
        this.hoursAmount = hoursAmount;
    }

    public int getAttendeesAmount() {
        return attendeesAmount;
    }

    public void setAttendeesAmount(int attendeesAmount) {
        this.attendeesAmount = attendeesAmount;
    }

    @Override
    public String toString() {
        return "\nEvents{" + client + "\nplaceEvent: " + placeEvent + ", date: " + date.toLocaleString() + ", hoursAmount: " + hoursAmount + ", attendeesAmount: " + attendeesAmount;
    }

}
