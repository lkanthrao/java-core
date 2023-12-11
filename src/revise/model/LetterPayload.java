package revise.model;

import java.util.Objects;

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
     * */
    public static class LetterPayloadBuilder {
        private String letterContent;

        // public int letterId; //LK: choose the access modifiers with care. Even for private, you can have setters.

        private String letterAddress;

        private String deliveryMethod;

        private int letterId;

        private String recipientName;

        private LetterPayloadBuilder() {

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
            this.deliveryMethod = content;
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
            LetterPayload letterPayload = new LetterPayload(letterId, letterContent, letterAddress, deliveryMethod, recipientName);

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