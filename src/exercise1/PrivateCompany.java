package exercise1;

import exercise1.ConcreteClients.GroupClient;

/**
 *
 * @author Ana Teresa
 */
public class PrivateCompany extends GroupClient {

    public PrivateCompany() {
    }

    public PrivateCompany(String InstitutionName, String contactTel, String TelDescription, Person personApplying) {
        super(InstitutionName, contactTel, TelDescription, personApplying);
    }

}
