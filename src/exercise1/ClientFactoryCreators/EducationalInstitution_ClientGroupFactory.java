package exercise1.ClientFactoryCreators;

import exercise1.AbstractClientFactoryCreators.ClientGroupFactory;
import exercise1.AbstractClientBuilders.AbstractClientBuilder;
import exercise1.Exceptions.ClientException;
import exercise1.ConcreteClientBuilders.EducationalInstitutionBuilder;
import exercise1.ConcreteClients.GroupClient;
import exercise1.ConcreteObjects.Person;

/**
 *
 * @author Ana Teresa
 */
public class EducationalInstitution_ClientGroupFactory implements ClientGroupFactory {

    AbstractClientBuilder absGroupClient = new EducationalInstitutionBuilder();

    @Override
    public GroupClient createClient(String InstitutionName, String TelDescription, String contactTel, Person personApplying) throws ClientException {
        return clientDirector.createGroupClient(absGroupClient, InstitutionName, TelDescription, contactTel, personApplying);
    }

}
