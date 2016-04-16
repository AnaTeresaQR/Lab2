package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class GovernmentEntityBuilder extends ClientGroupBuilder {

    @Override
    public GrupalClient createSpecificGroupClient() {
        return new GovernmentEntity();
    }

}
