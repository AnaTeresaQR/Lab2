package exercise1;

import exercise1.ConcreteClients.GeneralClient;

/**
 *
 * @author Ana Teresa
 */
public interface ClientFactory {

    ClientDirector clientDirector = new ClientDirector();

    public GeneralClient createClient(String InstitutionName, String TelDescription, String contactTel, Person personApplying) throws ClientException;

}
