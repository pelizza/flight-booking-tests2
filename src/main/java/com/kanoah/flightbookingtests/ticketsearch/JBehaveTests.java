package com.kanoah.flightbookingtests.ticketsearch;

import org.jbehave.core.InjectableEmbedder;
import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.AnnotatedEmbedderRunner;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

@RunWith(AnnotatedEmbedderRunner.class)
@Configure(storyLoader = JBehaveTests.StoryLoader.class,
        storyReporterBuilder = JBehaveTests.ReportBuilder.class)
@UsingEmbedder(embedder = Embedder.class, generateViewAfterStories = true, ignoreFailureInStories = false,
        ignoreFailureInView = true, verboseFailures = true)
@UsingSteps(instances = { TicketSearchBehaviourSteps.class })
public class JBehaveTests extends InjectableEmbedder {
    @Test
    public void run() {
        List<String> storyPaths = new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), "**/*.story", "");
        injectedEmbedder().runStoriesAsPaths(storyPaths);
    }
    public static class StoryLoader extends LoadFromClasspath {
        public StoryLoader() {
            super(JBehaveTests.class.getClassLoader());
        }
    }
    public static class ReportBuilder extends StoryReporterBuilder {
        public ReportBuilder() {
            this.withFormats(org.jbehave.core.reporters.Format.CONSOLE,
                    org.jbehave.core.reporters.Format.HTML).withDefaultFormats();
        }
    }
}
