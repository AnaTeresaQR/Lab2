package exercise1.AbstractClientBuilders;

import exercise1.ConcreteClients.GeneralClient;
import exercise1.Exceptions.ClientException;
import exercise1.ConcreteClients.GroupClient;

/**
 *
 * @author Ana Teresa
 */
public abstract class ClientGroupBuilder extends ClientGeneralBuilder implements AbstractClientBuilder {

    public ClientGroupBuilder() {

    }

    @Override
    public void createInstitutionName(String InsName) throws ClientException {
        if (InsName != null && !InsName.equals("")) {
            ((GroupClient) getClient()).setInstitutionName(InsName);
        } else {
            throw new ClientException("El nombre de la institución es requerido");
        }
    }

    @Override
    public void createTelDescription(String telDescription) throws ClientException {
        if (telDescription != null && !telDescription.equals("")) {
            ((GroupClient) getClient()).setTelDescription(telDescription);
        } else {
            throw new ClientException("La descrpción del teléfono es requerido");
        }
    }

}
