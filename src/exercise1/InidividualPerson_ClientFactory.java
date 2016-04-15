package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class InidividualPerson_ClientFactory implements ClientFactoryIndividual {

    @Override
    public GeneralClient createClient(String contactTel, Person personApplying) {
        return new IndividualPerson(contactTel, personApplying);
    }

}
