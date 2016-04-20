package exercise1.Strategy;

import exercise1.ProductEventsBuilders.GeneralEvents;

/**
 *
 * @author Edgardo Quirós
 */
public class PrivateEntityGain implements AbstractGainStrategy {

    @Override
    public double gain(GeneralEvents ge) {
        double total;
        total = (ge.getAttendeesAmount() * priceForPerson);
        return total;
    }
}
