package ii.annot;


import test.AnnotTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotHandler {

    public AnnotHandler() {
        Class AnnotTest1 = AnnotTest.class;

        for (Method method : AnnotTest1.getMethods()) {
            MyOverride myAnnotation = method.getAnnotation(MyOverride.class);

            if (myAnnotation != null) {
                System.out.println("Annotation Found....");
                if (myAnnotation.annotationType() == MyOverride.class) {
                    System.out.println("Annotation Found....");
                }
            }
        }

        MyAnotherMarkUpInterf myAnotherMarkUpInterf = new MyAnotherMarkUpInterf() {
            @Override
            public Class<? extends Annotation> annotationType() { // this is not declared in MyAnotherMarkUpInterf, still you should extend it
                return null;
            }
        };

        AbeanToTestMarkUpIntr abeanToTestMarkUpIntr = new AbeanToTestMarkUpIntr();

        System.out.println("Now another marker interf");

        System.out.println("Reflect - Methods");
        for (Method method1 : abeanToTestMarkUpIntr.getClass().getMethods()) {
            System.out.println(method1.getAnnotation(MyAnotherMarkUpInterf.class));
            System.out.println(method1.getName());
        }


        System.out.println("Reflect - Fields");
        for (Field field : abeanToTestMarkUpIntr.getClass().getDeclaredFields()) {
            System.out.println(field.getAnnotation(MyAnotherMarkUpInterf.class));
            System.out.println(field.getName());
        }
    }

    class AbeanToTestMarkUpIntr {

        private final int finalVariable;

        private final int finalVariable2 = 0;

        @MyAnotherMarkUpInterf
        private String aFieldUsingMarkup;

        AbeanToTestMarkUpIntr() {
            this.finalVariable = 0; // this works

//            this.finalVariable2 = 0; this wont woek, once initilized, then cannot reintitilize final cariable



        }



        void acessFinalVariable() {

            aFieldUsingMarkup = "lk";
        }

    }
}
