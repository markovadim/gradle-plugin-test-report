package ru.clevertec.testreportplugin;

import org.gradle.api.Project;
import org.gradle.api.Plugin;
import ru.clevertec.testreportplugin.TestReportTask;

public class GradlePluginTestReportPlugin implements Plugin<Project> {

    public void apply(Project project) {
        project.getTasks().register("checkReport", TestReportTask.class).get().dependsOn("test");
    }
}