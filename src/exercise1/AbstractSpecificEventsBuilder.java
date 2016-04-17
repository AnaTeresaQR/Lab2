package exercise1;

/**
 *
 * @author Ana Teresa
 */
public interface AbstractSpecificEventsBuilder extends AbstractEventsBuilder {

    public void createUnderAgeAmount(int underAgeAmount) throws EventsException;

    public SpecificEvents getSpecificEvents();
}
