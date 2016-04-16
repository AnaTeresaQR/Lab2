package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class PrivateCompanyBuilder extends ClientGroupBuilder {

    @Override
    public GrupalClient createSpecificGroupClient() {
        return new PrivateCompany();
    }

}
