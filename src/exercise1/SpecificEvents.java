package exercise1;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class SpecificEvents extends GeneralEvents {

    private int underageAmount;

    public SpecificEvents() {
    }

    public SpecificEvents(GeneralClient client, String placeEvent, Date date, int hoursAmount, int attendeesAmount, int underageAmount) {
        super(client, placeEvent, date, hoursAmount, attendeesAmount);
        this.underageAmount = underageAmount;
    }

    public void setUnderageAmount(int underageAmount) {
        this.underageAmount = underageAmount;
    }

    public int getUnderageAmount() {
        return underageAmount;
    }

}
