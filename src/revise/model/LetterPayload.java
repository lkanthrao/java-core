package revise.model;

import java.util.Objects;

public class LetterPayload {

    private int letterId;

    private String letterContent;

    private String letterAddress;

    private String deliveryMethod;

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
            LetterPayload letterPayload = new LetterPayload();

            letterPayload.setLetterId(letterId);
            letterPayload.setLetterContent(letterContent);
            letterPayload.setLetterAddress(letterAddress);
            letterPayload.setDeliveryMethod(deliveryMethod);

            return letterPayload;
        }
    }
}