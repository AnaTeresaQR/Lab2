package exercise1.AbstractClientFactoryCreators;

import exercise1.AbstractClientBuilders.AbstractGeneralClientBuilder;
import exercise1.ClientDirector;
import exercise1.ClientException;
import exercise1.ClientGeneralBuilder;
import exercise1.ConcreteClients.GeneralClient;
import exercise1.Person;

/**
 *
 * @author Ana Teresa
 */
public interface ClientGeneralFactory {

    AbstractGeneralClientBuilder abstGeneralC = new ClientGeneralBuilder();
    ClientDirector clientDirector = new ClientDirector();

    public GeneralClient createClient(String contactTel, Person personApplying) throws ClientException;

}
