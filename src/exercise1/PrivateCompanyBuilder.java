package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class PrivateCompanyBuilder extends ClientGroupBuilder {

    @Override
    public GrupalClient createSpecificGroupClient(GrupalClient specific) {
        return new PrivateCompany();
    }

}
