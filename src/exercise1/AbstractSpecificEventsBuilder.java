package exercise1;

import exercise1.Exceptions.EventsException;

/**
 *
 * @author Ana Teresa
 */
public interface AbstractSpecificEventsBuilder extends AbstractEventsBuilder {

    public void createUnderAgeAmount(int underAgeAmount) throws EventsException;

    public SpecificEvents getSpecificEvents();
}
