package exercise1.ProductEventsBuilders;

import exercise1.ConcreteClients.GeneralClient;
import exercise1.Decorator.ExtraDecoration;
import exercise1.Decorator.GainDecoratorInterface;
import exercise1.Strategy.AbstractGainStrategy;
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
    private double price;

    private AbstractGainStrategy strategy;
    GeneralEvents gi;

    public GeneralEvents() {
    }

    public GeneralEvents(GeneralClient client, String placeEvent, Date date, int hoursAmount, int attendeesAmount) {
        this.client = client;
        this.placeEvent = placeEvent;
        this.date = date;
        this.hoursAmount = hoursAmount;
        this.attendeesAmount = attendeesAmount;
        this.price = 0;
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

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setStrategy(AbstractGainStrategy strategy) {
        this.strategy = strategy;
    }

    public AbstractGainStrategy getStrategy() {
        return strategy;
    }

    public void setGi(GeneralEvents gi) {
        this.gi = gi;
    }

    public GeneralEvents getGi() {
        return gi;
    }

    @Override
    public String toString() {
        return "\nPrice: " + price + "\nEvents{" + this.client + "\nplaceEvent: " + this.placeEvent + ", date: " + this.date.toLocaleString() + ", hoursAmount: " + this.hoursAmount + ", attendeesAmount: " + this.attendeesAmount;
    }

}
