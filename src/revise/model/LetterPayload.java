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

    public static class LetterPayloadBuilderNotWorking {
        private static LetterPayload letterPayload;

        public LetterPayloadBuilderNotWorking newLetterBuilder() {
            letterPayload = new LetterPayload();
            return this;
        }

        public LetterPayloadBuilderNotWorking withAddress(String address) {
            letterPayload.setLetterAddress(address);
            return this;
        }

        public LetterPayloadBuilderNotWorking withDeliveryMethod(String deliveryMethod) {
            letterPayload.setDeliveryMethod(deliveryMethod);
            return this;
        }

        public LetterPayloadBuilderNotWorking withContent(String content) {
            letterPayload.setLetterContent(content);
            return this;
        }

        public LetterPayload build() {
            return letterPayload;
        }
    }
}