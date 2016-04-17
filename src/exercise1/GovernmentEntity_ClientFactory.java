package exercise1;

import exercise1.AbstractClientBuilders.AbstractClientBuilder;
import exercise1.ConcreteClients.GeneralClient;

/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntity_ClientFactory implements ClientFactory {

    AbstractClientBuilder absGroupClient = new GovernmentEntityBuilder();

    @Override
    public GeneralClient createClient(String InstitutionName, String TelDescription, String contactTel, Person personApplying) throws ClientException {
        return clientDirector.createGrupalClient(absGroupClient, InstitutionName, TelDescription, contactTel, personApplying);
    }

}
