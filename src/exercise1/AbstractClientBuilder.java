package exercise1;

/**
 *
 * @author Ana Teresa
 */
public interface AbstractClientBuilder extends AbstractGeneralClientBuilder {

    public void createInstitutionName(String InsName) throws ClientException;

    public void createTelDescription(String telDescription) throws ClientException;

    public GrupalClient getgClient();

    public abstract GrupalClient createSpecificGroupClient();

}
