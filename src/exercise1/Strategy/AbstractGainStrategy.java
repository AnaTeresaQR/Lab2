package exercise1.Strategy;

import exercise1.ProductEventsBuilders.GeneralEvents;

/**
 *
 * @author Edgardo Quirós
 */
public interface AbstractGainStrategy {

    int priceForPerson = 7500;

    public abstract double gain(GeneralEvents ge);
}
