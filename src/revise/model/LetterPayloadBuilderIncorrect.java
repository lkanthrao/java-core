package revise.model;

//LK: @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
//this means the annotation can only be applied to above context - field, method ....
@SuppressWarnings("unused")
public class LetterPayloadBuilderIncorrect {
    @SuppressWarnings("unused")
    private static LetterPayload letterPayload;

    public LetterPayloadBuilderIncorrect newLetterBuilder() {
//        letterPayload = new LetterPayload(); LK: builder pattern failed.
        return this;
    }

    public LetterPayloadBuilderIncorrect withAddress(String address) {
//        letterPayload.setLetterAddress(address); //LK: It's now broken, as fields are private and final
        return this;
    }

    public LetterPayloadBuilderIncorrect withDeliveryMethod(String deliveryMethod) {
//        letterPayload.setDeliveryMethod(deliveryMethod); //LK: It's now broken, as fields are private and final
        return this;
    }

    public LetterPayloadBuilderIncorrect withLetterId(Integer letterId) {
//        letterPayload.setLetterId(letterId); //LK: It's now broken, as fields are private and final
        return this;
    }

    public LetterPayloadBuilderIncorrect withContent(String content) {
//        letterPayload.setLetterContent(content); //LK: It's now broken, as fields are private and final
        return this;
    }

    public LetterPayload build() {
        return letterPayload;
    }

}









