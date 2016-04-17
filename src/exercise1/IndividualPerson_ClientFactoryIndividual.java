package exercise1;

import exercise1.ConcreteClients.GeneralClient;

/**
 *
 * @author Ana Teresa
 */
public class IndividualPerson_ClientFactoryIndividual implements ClientFactoryIndividual {

    @Override
    public GeneralClient createClient(String contactTel, Person personApplying) throws ClientException {
        return clientDirector.createIndividualClient(abstGeneralC, contactTel, personApplying);
    }

}
