package exercise1;

import exercise1.ConcreteClients.GeneralClient;

/**
 *
 * @author Ana Teresa
 */
public class IndividualPerson extends GeneralClient {

    public IndividualPerson() {
    }

    public IndividualPerson(String contactTel, Person personApplying) {
        super(contactTel, personApplying);
    }

}
