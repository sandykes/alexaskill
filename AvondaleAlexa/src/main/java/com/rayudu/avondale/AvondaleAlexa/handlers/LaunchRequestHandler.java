package com.rayudu.avondale.AvondaleAlexa.handlers;


import static com.amazon.ask.request.Predicates.requestType;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;


public class LaunchRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Welcome to the avondale public school skill, You can ask about school holidays, calendar.";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("avondale", speechText)
                .withReprompt(speechText)
                .build();
    }

}