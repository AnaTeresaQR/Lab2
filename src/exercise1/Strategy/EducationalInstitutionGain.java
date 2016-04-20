package exercise1.Strategy;

import exercise1.ProductEventsBuilders.GeneralEvents;
import exercise1.ProductEventsBuilders.SpecificEvents;

/**
 *
 * @author Edgardo Quirós
 */
public class EducationalInstitutionGain implements AbstractGainStrategy {

    @Override
    public double gain(GeneralEvents ge) {
        SpecificEvents sp = (SpecificEvents) ge;
        double total;
        double priceForUnderage = priceForPerson * 0.75;
        int adults = sp.getAttendeesAmount() - sp.getUnderageAmount();
        total = (adults * priceForPerson) + (sp.getUnderageAmount() * priceForUnderage);
        return total;
    }

}
