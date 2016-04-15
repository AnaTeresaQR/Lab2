package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class ClientGroupBuilder extends ClientGeneralBuilder implements AbstractClientBuilder {

    GrupalClient gClient;

    public ClientGroupBuilder() {
        gClient = new GrupalClient();
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
            gClient.setTelDescription("");
        } else {
            throw new ClientException("La descrpción del teléfono es requerido");
        }
    }

    @Override
    public GrupalClient getgClient() {
        return gClient;
    }

}
