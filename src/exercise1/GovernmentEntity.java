package exercise1;

import exercise1.ConcreteClients.GroupClient;

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
