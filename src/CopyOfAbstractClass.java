public abstract class CopyOfAbstractClass extends AbstractClass {

    private static String a;

    public CopyOfAbstractClass(String type, String height) {
        // TODO Auto-generated constructor stub

        AbstractClass a = new AbstractClass() {

            @Override
            public void Draw1() {

            }

            @Override
            public void Draw2() {

            }

            @Override
            public void Draw() {
                // TODO Auto-generated method stub

            }
        };
    }

    public static void main(String[] args) {

        AbstractClass a = new AbstractClass() {

            @Override
            public void Draw1() {

            }

            @Override
            public void Draw2() {

            }

            @Override
            public void Draw() {
                // TODO Auto-generated method stub

            }
        };

    }

    public final void Draw() {
        // TODO Auto-generated method stub

    }
}
