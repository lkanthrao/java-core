package revise.activities;

import revise.model.LetterPayload;
import revise.model.LetterPayloadBuilderIncorrect;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenerateLetterPayload {

    public static final Integer LETTER_ID = 43453;

    public static void main(String[] args) {

        LetterPayloadBuilderIncorrect letterPayloadBuilderIncorrect = new LetterPayloadBuilderIncorrect().newLetterBuilder();

        LetterPayload letterPayload = letterPayloadBuilderIncorrect.withAddress("address")
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
