package exercise1.AbstractClientFactoryCreators;

import exercise1.Directors.ClientDirector;
import exercise1.Exceptions.ClientException;
import exercise1.ConcreteClients.GroupClient;
import exercise1.ConcreteObjects.Person;

/**
 *
 * @author Ana Teresa
 */
public interface ClientGroupFactory {

    ClientDirector clientDirector = new ClientDirector();

    public GroupClient createClient(String InstitutionName, String TelDescription, String contactTel, Person personApplying) throws ClientException;

}
