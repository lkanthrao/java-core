package revise.activities;

import revise.model.LetterPayload;
import revise.model.LetterPayloadBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenerateLetterPayload {

    public static final Integer LETTER_ID = 43453;

    public static void main(String[] args) {

        LetterPayloadBuilder letterPayloadBuilder = new LetterPayloadBuilder().newLetterBuilder();

        LetterPayload letterPayload = letterPayloadBuilder.withAddress("address")
                .withContent("Content")
                .withDeliveryMethod("Delivery method")
                .withLetterId(LETTER_ID)
                .build();

        List<LetterPayload> letterPayloads = new ArrayList<>();
        letterPayloads.add(letterPayload);

        Optional<LetterPayload> first = letterPayloads.stream()
                .filter(eachLetterPayload -> eachLetterPayload.getLetterId() == LETTER_ID)
                .findFirst();

        System.out.println(first.isPresent());


    }

}
