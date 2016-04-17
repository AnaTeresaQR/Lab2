package exercise1.AbstractClientBuilders;

import exercise1.Exceptions.ClientException;
import exercise1.ConcreteClients.GeneralClient;
import exercise1.ConcreteObjects.Person;

/**
 *
 * @author Ana Teresa
 */
public interface AbstractGeneralClientBuilder {

    public void createContactTel(String contactTel) throws ClientException;

    public void createPersonApplying(Person personApplying) throws ClientException;

    public GeneralClient getClient();
}
