package revise.model;

import java.util.Objects;

public class LetterPayload {

    private int letterId;

    private String letterContent;

    private String letterAddress;

    private String deliveryMethod;

    private String recipientName;

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
        this.recipientName = recipientName;
    }

    public int getLetterId() {
        return letterId;
    }

    public void setLetterId(int letterId) {
        this.letterId = letterId;
    }

    public String getLetterContent() {
        return letterContent;
    }

    public void setLetterContent(String letterContent) {
        this.letterContent = letterContent;
    }

    public String getLetterAddress() {
        return letterAddress;
    }

    public void setLetterAddress(String letterAddress) {
        this.letterAddress = letterAddress;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
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

    public static class LetterPayloadBuilder {
        public int letterId;

        public String letterContent;

        public String letterAddress;

        public String deliveryMethod;

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