package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class IndividualPerson_ClientFactory implements ClientFactoryIndividual {

    @Override
    public GeneralClient createClient(String contactTel, Person personApplying) throws ClientException {
        return clientDirector.createIndividualClient(abstGeneralC, contactTel, personApplying);
    }

}