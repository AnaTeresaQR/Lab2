package exercise1.AbstractEventsBuilders;

import exercise1.Exceptions.EventsException;
import exercise1.ProductEventsBuilders.SpecificEvents;

/**
 *
 * @author Ana Teresa
 */
public interface AbstractSpecificEventsBuilder extends AbstractEventsBuilder {

    public void createUnderAgeAmount(int underAgeAmount) throws EventsException;

    public SpecificEvents getSpecificEvents();
}
