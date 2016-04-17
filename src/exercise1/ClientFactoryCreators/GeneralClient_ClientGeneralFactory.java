package exercise1.ClientFactoryCreators;

import exercise1.AbstractClientFactoryCreators.ClientGeneralFactory;
import exercise1.ClientException;
import exercise1.ConcreteClients.GeneralClient;
import exercise1.Person;

/**
 *
 * @author Ana Teresa
 */
public class GeneralClient_ClientGeneralFactory implements ClientGeneralFactory {

    @Override
    public GeneralClient createClient(String contactTel, Person personApplying) throws ClientException {
        return clientDirector.createIndividualClient(abstGeneralC, contactTel, personApplying);
    }

}
