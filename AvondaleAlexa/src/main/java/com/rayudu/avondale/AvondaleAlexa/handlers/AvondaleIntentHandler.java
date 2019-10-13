package com.rayudu.avondale.AvondaleAlexa.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.DialogState;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.Slot;

//import se.kits.soroush.alexa.client.StationClient;

public class AvondaleIntentHandler implements RequestHandler {

    private static final Logger log = LoggerFactory.getLogger(AvondaleIntentHandler.class);
    private static final String CITY_NAME = "myCity";
   // private StationClient client = new StationClient();

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("avondaleintent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        IntentRequest request = (IntentRequest) input.getRequestEnvelope().getRequest();
        String speechText="Yes this is rayudu";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("station", speechText)
                .build();
    }

   
}

