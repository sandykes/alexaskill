package com.rayudu.avondale.AvondaleAlexa;


import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

import com.rayudu.avondale.AvondaleAlexa.handlers.AvondaleIntentHandler;
import com.rayudu.avondale.AvondaleAlexa.handlers.FallbackIntentHandler;
import com.rayudu.avondale.AvondaleAlexa.handlers.HelpIntentHandler;
import com.rayudu.avondale.AvondaleAlexa.handlers.LaunchRequestHandler;


public class AvondaleStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new FallbackIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),                     
                        new AvondaleIntentHandler())
                .build();
    }

    public AvondaleStreamHandler() {
        super(getSkill());
    }
}