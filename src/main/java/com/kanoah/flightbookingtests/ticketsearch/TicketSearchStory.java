package com.kanoah.flightbookingtests.ticketsearch;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.Locale;

public class TicketSearchStory extends JUnitStory {
    @Override
    public Configuration configuration() {
        MostUsefulConfiguration mostUsefulConfiguration = new MostUsefulConfiguration();
//        mostUsefulConfiguration.useKeywords(new LocalizedKeywords(Locale.forLanguageTag("pt_BR")));
        return mostUsefulConfiguration;
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new TicketSearchBehaviourSteps());
    }
}
