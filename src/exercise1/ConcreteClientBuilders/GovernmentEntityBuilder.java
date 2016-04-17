package exercise1.ConcreteClientBuilders;

import exercise1.*;
import exercise1.AbstractClientBuilders.ClientGroupBuilder;
import exercise1.ConcreteClients.GroupClient;

/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntityBuilder extends ClientGroupBuilder {

    @Override
    public GroupClient createSpecificGroupClient() {
        return new GovernmentEntity();
    }

}
