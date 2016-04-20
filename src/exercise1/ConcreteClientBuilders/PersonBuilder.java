package exercise1.ConcreteClientBuilders;

import exercise1.AbstractClientBuilders.ClientGeneralBuilder;
import exercise1.ConcreteClients.IndividualPerson;

/**
 *
 * @author Ana Teresa
 */
public class PersonBuilder extends ClientGeneralBuilder {

    @Override
    public void createSpecificGroupClient() {
        setClient(new IndividualPerson());
    }

}
