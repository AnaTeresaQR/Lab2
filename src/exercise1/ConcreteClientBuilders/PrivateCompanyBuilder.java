package exercise1.ConcreteClientBuilders;

import exercise1.AbstractClientBuilders.ClientGroupBuilder;
import exercise1.ConcreteClients.GroupClient;
import exercise1.ConcreteClients.PrivateCompany;

/**
 *
 * @author Ana Teresa
 */
public class PrivateCompanyBuilder extends ClientGroupBuilder {

    @Override
    public GroupClient createSpecificGroupClient() {
        return new PrivateCompany();
    }

}
