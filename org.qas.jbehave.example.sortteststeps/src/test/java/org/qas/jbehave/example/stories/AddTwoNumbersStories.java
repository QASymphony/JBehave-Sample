package org.qas.jbehave.example.stories;

import org.qas.jbehave.example.steps.AddTwoNumbersSteps;
import org.qas.jbehave.example.steps.MultiTwoNumbersSteps;
import org.qas.jbehave.example.steps.SubtTwoNumbersSteps;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumbersStories extends JUnitStories {

    @Override
    public Configuration configuration() {
        URL storyURL = null;
        try {
            // This requires you to start Maven from the project directory
            storyURL = new URL("file://var/jenkins_home/workspace/JenkinsPluginDemo/org.qas.jbehave.example.sortteststeps");
            //+ System.getProperty("user.dir")
            //   + "/src/main/resources/stories/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return new MostUsefulConfiguration().useStoryLoader(new LoadFromRelativeFile(storyURL))
                .useStoryReporterBuilder(new StoryReporterBuilder()
                        .withFormats(Format.CONSOLE)
                        .withFormats(Format.HTML)
                        .withFormats(Format.XML));
    }

    // Here we specify the steps classes
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new AddTwoNumbersSteps(), new SubtTwoNumbersSteps(), new MultiTwoNumbersSteps());
    }

    //Here we specify the stories
    @Override
    protected List<String> storyPaths() {
        return Arrays.asList(
               "src/test/resources/org/qas/jbehave/example/stories/addtwonumbers_stories.story",
                "src/test/resources/org/qas/jbehave/example/stories/subttwonumbers_stories.story",
                 "src/test/resources/org/qas/jbehave/example/stories/multitwonumbers_stories.story"
        );
    }

    @Override
    @Test
    public void run() {
        try {
            super.run();
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}