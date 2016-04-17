package exercise1;

import exercise1.AbstractClientBuilders.ClientGroupBuilder;
import exercise1.ConcreteClients.GrupalClient;

/**
 *
 * @author Ana Teresa
 */
public class PrivateCompanyBuilder extends ClientGroupBuilder {

    @Override
    public GrupalClient createSpecificGroupClient() {
        return new PrivateCompany();
    }

}
