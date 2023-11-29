package revise;

public interface Delegate {
    void runDelegatedWork();

    /*void runDelegatedWork2(); LK: this will lead child interfaces with @FunctionalInterface to break*/
}
