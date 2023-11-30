package revise.delegate;

@FunctionalInterface
public interface SingleWorkerDelegate extends Delegate {

    static void pushStaticValues() {

    }

    public default void defaultDelegate() {

    }

}
