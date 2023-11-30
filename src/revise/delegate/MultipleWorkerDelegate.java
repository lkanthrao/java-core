package revise.delegate;

@FunctionalInterface
public interface MultipleWorkerDelegate extends Delegate {

    /* LK: Implementation method in interface should have static or default*/
    public static void executeStatic() {

    }

    /*LK: no need of public in interface*/
    default void executeDefault() {

    }

    private void executeWithin() {

    }

    /*LK: this is also a functional interface because it extends SAM in parent interface*/
    /*LK: public void executeChild1(); cannot have this when Interface is marked with @FunctionalInterface*/

}
