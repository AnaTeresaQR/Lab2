package exercise1;

import exercise1.AbstractClientBuilders.ClientGroupBuilder;
import exercise1.ConcreteClients.GroupClient;

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
