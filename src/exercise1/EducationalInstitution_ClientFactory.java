package exercise1;

import exercise1.AbstractClientBuilders.AbstractClientBuilder;
import exercise1.ConcreteClients.GeneralClient;

/**
 *
 * @author Ana Teresa
 */
public class EducationalInstitution_ClientFactory implements ClientFactory {

    AbstractClientBuilder absGroupClient = new EducationalInstitutionBuilder();

    @Override
    public GeneralClient createClient(String InstitutionName, String TelDescription, String contactTel, Person personApplying) throws ClientException {
        return clientDirector.createGrupalClient(absGroupClient, InstitutionName, TelDescription, contactTel, personApplying);
    }

}
