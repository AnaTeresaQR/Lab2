package exercise1;

import exercise1.AbstractClientBuilders.ClientGroupBuilder;
import exercise1.ConcreteClients.GrupalClient;

/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntityBuilder extends ClientGroupBuilder {

    @Override
    public GrupalClient createSpecificGroupClient() {
        return new GovernmentEntity();
    }

}
