package exercise1.ConcreteClientBuilders;

import exercise1.AbstractClientBuilders.ClientGroupBuilder;
import exercise1.ConcreteClients.GovernmentEntity;

/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntityBuilder extends ClientGroupBuilder {
    
    @Override
    public void createSpecificGroupClient() {
        setClient(new GovernmentEntity());
    }
    
}
