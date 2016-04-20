package exercise1.AbstractClientBuilders;

import exercise1.Exceptions.ClientException;

/**
 *
 * @author Ana Teresa
 */
public interface AbstractClientBuilder extends AbstractGeneralClientBuilder {

    public void createInstitutionName(String InsName) throws ClientException;

    public void createTelDescription(String telDescription) throws ClientException;

}
