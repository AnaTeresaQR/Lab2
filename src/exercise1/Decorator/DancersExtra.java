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
public class DancersExtra {

    GeneralEvents gi;

    public DancersExtra(GeneralEvents ge) {
        this.gi = ge;
    }

    public void setPrice(double price) {
        gi.setPrice(gi.getPrice() + price);

    }

    public double getPrice() {
        return gi.getPrice();
    }

}
