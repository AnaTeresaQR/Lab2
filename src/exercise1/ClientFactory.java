package exercise1;

import exercise1.ConcreteClients.GrupalClient;

/**
 *
 * @author Ana Teresa
 */
public interface ClientFactory {

    ClientDirector clientDirector = new ClientDirector();

    public GrupalClient createClient(String InstitutionName, String TelDescription, String contactTel, Person personApplying) throws ClientException;

}
