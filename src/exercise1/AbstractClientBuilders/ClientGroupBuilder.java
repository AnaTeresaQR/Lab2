package exercise1.AbstractClientBuilders;

import exercise1.ClientException;
import exercise1.ConcreteClients.GroupClient;

/**
 *
 * @author Ana Teresa
 */
public abstract class ClientGroupBuilder extends ClientGeneralBuilder implements AbstractClientBuilder {

    GroupClient gClient;

    public ClientGroupBuilder() {
        gClient = (GroupClient) super.client;
    }

    @Override
    public void createInstitutionName(String InsName) throws ClientException {
        if (InsName != null && !InsName.equals("")) {
            gClient.setInstitutionName(InsName);
        } else {
            throw new ClientException("El nombre de la institución es requerido");
        }
    }

    @Override
    public void createTelDescription(String telDescription) throws ClientException {
        if (telDescription != null && !telDescription.equals("")) {
            gClient.setTelDescription(telDescription);
        } else {
            throw new ClientException("La descrpción del teléfono es requerido");
        }
    }

    @Override
    public GroupClient getgClient() {
        return gClient;
    }

}
