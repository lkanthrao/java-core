package revise.model;

public class LetterPayloadBuilder {
    private static LetterPayload letterPayload;

    public LetterPayloadBuilder newLetterBuilder() {
        letterPayload = new LetterPayload();
        return this;
    }

    public LetterPayloadBuilder withAddress(String address) {
        letterPayload.setLetterAddress(address);
        return this;
    }

    public LetterPayloadBuilder withDeliveryMethod(String deliveryMethod) {
        letterPayload.setDeliveryMethod(deliveryMethod);
        return this;
    }

    public LetterPayloadBuilder withContent(String content) {
        letterPayload.setLetterContent(content);
        return this;
    }

    public LetterPayload build() {
        return letterPayload;
    }

}









