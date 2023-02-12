package ru.clevertec.testreportplugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;

public class TestReportTask extends DefaultTask {

    @TaskAction
    void checkTestReportWithDefaultName() {
        String reportPath = "./build/reports/tests/test/index.html";
        File file = new File(reportPath);
        if (file.exists()) {
            System.out.println("Test Report was created");
        } else System.out.println("Report was not found");
    }
}
