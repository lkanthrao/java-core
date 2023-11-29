package revise;

@FunctionalInterface
public interface SingleDelegate extends Delegate {

    static void pushStaticValues() {

    }

    public default void defaultDelegate() {

    }

}
