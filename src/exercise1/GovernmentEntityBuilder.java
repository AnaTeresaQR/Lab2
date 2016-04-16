package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntityBuilder extends ClientGroupBuilder {

    @Override
    public GrupalClient createSpecificGroupClient(GrupalClient specific) {
        return new GovernmentEntity();
    }

}
