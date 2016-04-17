package exercise1;

import exercise1.ConcreteClients.GroupClient;

/**
 *
 * @author Ana Teresa
 */
public interface ClientGroupFactory {

    ClientDirector clientDirector = new ClientDirector();

    public GroupClient createClient(String InstitutionName, String TelDescription, String contactTel, Person personApplying) throws ClientException;

}
