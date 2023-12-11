package revise.model;

import java.util.Objects;

@SuppressWarnings("unused")
public class LetterPayload {

    private final int letterId;

    private final String letterContent;

    private final String letterAddress;

    private final String deliveryMethod;

    private final String recipientName;

    //LK: All of the above fields should be final. Otherwise, what's the point in creating object of this class
    // it's properties can be modified anytime. Since it's now final, you can't have setters to it.

    public LetterPayload(int letterId, String letterContent, String letterAddress, String deliveryMethod, String recipientName) {
        this.letterId = letterId;
        this.letterContent = letterContent;
        this.letterAddress = letterAddress;
        this.deliveryMethod = deliveryMethod;
        this.recipientName = recipientName;
    }

    public LetterPayload(LetterPayloadBuilder letterPayloadBuilder) {
        this.letterId = letterPayloadBuilder.letterId;
        this.letterContent = letterPayloadBuilder.letterContent;
        this.letterAddress = letterPayloadBuilder.letterAddress;
        this.deliveryMethod = letterPayloadBuilder.deliveryMethod;
        this.recipientName = letterPayloadBuilder.recipientName;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
//        this.recipientName = recipientName; //LK final fields can have setters, only constructor injection.
    }

    public int getLetterId() {
        return letterId;
    }


    public String getLetterContent() {
        return letterContent;
    }


    public String getLetterAddress() {
        return letterAddress;
    }


    public String getDeliveryMethod() {
        return deliveryMethod;
    }


    //LK: Arrays.deepEquals - recursion is used to compare.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LetterPayload that)) return false;
        return letterId == that.letterId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(letterId);
    }


    /*
     * //LK: Method chaining is a useful design pattern but however if accessed concurrently,
     * a thread may observe some fields to contain inconsistent values.
     *
     * That's why LetterPayloadBuilderIncorrect would have an issue. To solve this problem,
     * there is Builder pattern to ensure the thread-safety and atomicity of object creation
     *
     * //LK: To solve -
     *   we have a inner static class named Builder inside our Server class with instance fields
     *   have a factory method to return an new instance of Builder class on every invocation
     *
     * this pattern should be used only if you need to build different complex immutable objects using the same building process
     *
     * The LetterPayload class has six final fields, one constructor taking all the parameters to be set
     *
     * if any non mandatory fields are added, you need Telescoping constructors. Hence builder pattern.
     * */
    public static class LetterPayloadBuilder {
        private String letterContent;

        // public int letterId; //LK: choose the access modifiers with care. Even for private, you can have setters.

        private String letterAddress;

        private String deliveryMethod;

        private int letterId;

        private String recipientName;

        private LetterPayloadBuilder() { //LK: note

        }

        public static LetterPayloadBuilder newLetterBuilder() {
            return new LetterPayloadBuilder();

        }

        public LetterPayloadBuilder withAddress(String address) {
            letterAddress = address;
            return this;
        }

        public LetterPayloadBuilder withDeliveryMethod(String deliveryMethod) {
            this.deliveryMethod = deliveryMethod;
            return this;
        }

        public LetterPayloadBuilder withContent(String content) {
            this.letterContent = content;
            return this;
        }

        public LetterPayloadBuilder withLetterId(Integer letterId) {
            this.letterId = letterId;
            return this;
        }

        public LetterPayloadBuilder withRecipientName(String recipientName) {
            this.recipientName = recipientName;
            return this;
        }

        public LetterPayload build() {
            /*
            LetterPayload letterPayload = new LetterPayload(letterId, letterContent, letterAddress, deliveryMethod, recipientName);
            //LK: it isn't the right way to do builder? why?????

            Alternatively, the Book constructor could take all the parameters corresponding to the Book fields,
            but this would mean that you must deal again with many parameters to be set in the right order when you
            call the Book constructor from the Builder’s build method. Mixing up parameters of the same type is one of
            the potential issues developers try to avoid by implementing the Builder pattern.

            Disadvantage : the potential issues developers try to avoid by implementing the Builder pattern.
            */


            LetterPayload letterPayload = new LetterPayload(this);

            /*
            letterPayload.setLetterId(letterId);
            letterPayload.setLetterContent(letterContent);
            letterPayload.setLetterAddress(letterAddress);
            letterPayload.setDeliveryMethod(deliveryMethod);

            //LK: What's the use of setters in the builder pattern? because the same can be used in main code?
            So, that's why you do constructor injection and make it mandatory to ensure it' availability depending on
            various use case.

            //LK:Let's say letter template can be used to construct fax, email, physical letter. There could be different
            constructor arguments required, hence in builder patter you can handle without breaking actual code.
            */

            return letterPayload;
        }
    }
}