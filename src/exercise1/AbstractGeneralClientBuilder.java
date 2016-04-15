package exercise1;

/**
 *
 * @author Ana Teresa
 */
public interface AbstractGeneralClientBuilder {

    public void createContactTel(String contactTel) throws ClientException;

    public void createPersonApplying(Person personApplying) throws ClientException;

    public GeneralClient getClient();
}
