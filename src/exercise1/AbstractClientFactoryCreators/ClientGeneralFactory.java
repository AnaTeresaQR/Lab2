package exercise1.AbstractClientFactoryCreators;

import exercise1.AbstractClientBuilders.AbstractGeneralClientBuilder;
import exercise1.AbstractClientBuilders.ClientGeneralBuilder;
import exercise1.Directors.ClientDirector;
import exercise1.Exceptions.ClientException;
import exercise1.ConcreteClients.GeneralClient;
import exercise1.ConcreteObjects.Person;

/**
 *
 * @author Ana Teresa
 */
public interface ClientGeneralFactory {

    AbstractGeneralClientBuilder abstGeneralC = new ClientGeneralBuilder();
    ClientDirector clientDirector = new ClientDirector();

    public GeneralClient createClient(String contactTel, Person personApplying) throws ClientException;

}
