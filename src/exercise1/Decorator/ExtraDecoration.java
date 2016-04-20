package exercise1.Decorator;

import exercise1.ProductEventsBuilders.GeneralEvents;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgardo Quirós
 */
public abstract class ExtraDecoration {
    GeneralEvents gi;

    public ExtraDecoration(GeneralEvents gi) {
        setGi(gi);
    }

    public GeneralEvents getGi() {
        return gi;
    }

    public void setGi(GeneralEvents gi) {
        this.gi = gi;
    }
    
}
