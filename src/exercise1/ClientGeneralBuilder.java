package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class ClientGeneralBuilder implements AbstractGeneralClientBuilder {

    GeneralClient client;

    public ClientGeneralBuilder() {
        client = new GeneralClient();
    }

    @Override
    public void createContactTel(String contactTel) throws ClientException {
        if (contactTel != null && !contactTel.equals("")) {
            client.setContactTel(contactTel);
        } else {
            throw new ClientException("El teléfono de contacto es requerido");
        }
    }

    @Override
    public void createPersonApplying(Person personApplying) throws ClientException {
        if (personApplying != null && !personApplying.equals("")) {
            client.setPersonApplying(personApplying);
        } else {
            throw new ClientException("Se requiere una persona solicitante");
        }
    }

    @Override
    public GeneralClient getClient() {
        return client;
    }

}
