/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1.Strategy;

import exercise1.ProductEventsBuilders.GeneralEvents;

/**
 *
 * @author Edgardo Quirós
 */
public class GovernmentEntityGain implements AbstractGainStrategy {

    @Override
    public double gain(GeneralEvents ge) {
        double total;
        total = (ge.getAttendeesAmount() * priceForPerson) * 0.90;
        return total;
    }
}
