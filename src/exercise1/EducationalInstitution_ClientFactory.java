package exercise1;

import exercise1.AbstractClientBuilders.AbstractClientBuilder;
import exercise1.ConcreteClients.GroupClient;

/**
 *
 * @author Ana Teresa
 */
public class EducationalInstitution_ClientFactory implements ClientGroupFactory {

    AbstractClientBuilder absGroupClient = new EducationalInstitutionBuilder();

    @Override
    public GroupClient createClient(String InstitutionName, String TelDescription, String contactTel, Person personApplying) throws ClientException {
        return clientDirector.createGrupalClient(absGroupClient, InstitutionName, TelDescription, contactTel, personApplying);
    }

}
