package exercise1.ConcreteClients;

import exercise1.*;

/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntity extends GroupClient {

    public GovernmentEntity() {
    }

    public GovernmentEntity(String InstitutionName, String TelDescription, String contactTel, Person personApplying) {
        super(InstitutionName, TelDescription, contactTel, personApplying);
    }

}
