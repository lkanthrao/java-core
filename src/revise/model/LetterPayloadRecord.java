package revise.model;

import java.util.Objects;

public record LetterPayloadRecord(int letterId, String letterContent, String letterAddress,
                                  String deliveryMethod, String recipientName) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LetterPayloadRecord that)) return false;
        return letterId == that.letterId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(letterId);
    }

    public static class LetterPayloadBuilder {
        private String letterContent;

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

        public LetterPayloadRecord build() {
            LetterPayloadRecord letterPayload = new LetterPayloadRecord(letterId, letterContent, letterAddress, deliveryMethod, recipientName);
            return letterPayload;
        }
    }
}