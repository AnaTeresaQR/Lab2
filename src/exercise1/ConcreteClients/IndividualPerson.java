package exercise1.ConcreteClients;

import exercise1.*;

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
