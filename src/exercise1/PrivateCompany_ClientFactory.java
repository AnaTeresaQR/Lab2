package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class PrivateCompany_ClientFactory implements ClientFactory {

    @Override
    public Client createClient(String InstitutionName, String contactTel, String TelDescription, Person personApplying) {
        return new PrivateCompany(InstitutionName, contactTel, TelDescription, personApplying);
    }

}
