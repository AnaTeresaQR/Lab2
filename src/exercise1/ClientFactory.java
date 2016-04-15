package exercise1;

/**
 *
 * @author Ana Teresa
 */
public interface ClientFactory {

    public GeneralClient createClient(String InstitutionName, String contactTel, String TelDescription, Person personApplying);

}
