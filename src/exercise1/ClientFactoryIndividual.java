package exercise1;

import exercise1.AbstractClientBuilders.AbstractGeneralClientBuilder;
import exercise1.ConcreteClients.GeneralClient;

/**
 *
 * @author Ana Teresa
 */
public interface ClientFactoryIndividual {

    AbstractGeneralClientBuilder abstGeneralC = new ClientGeneralBuilder();
    ClientDirector clientDirector = new ClientDirector();

    public GeneralClient createClient(String contactTel, Person personApplying) throws ClientException;

}
