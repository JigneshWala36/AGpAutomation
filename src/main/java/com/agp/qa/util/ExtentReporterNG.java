package com.agp.qa.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import static com.agp.qa.x.TestBase.prop;

public class ExtentReporterNG {

    public static ExtentReports getReportObject(){

        ExtentReports extent = new ExtentReports();
        String path = System.getProperty("user.dir")+"\\reports\\AG&P.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);

        extent.attachReporter(reporter);

        // Name of the Title
        String documentTitle = prop.getProperty("documentTitle", "AG&P Testing");
        reporter.config().setDocumentTitle(documentTitle);
        // Name of the report
        reporter.config().setReportName("Smoke Testing");
        // Dark Theme
        reporter.config().setTheme(Theme.DARK);

        // Details of System/Environment in report
        extent.setSystemInfo("AGP","Testing");
        extent.setSystemInfo("Environment", "UAT");
        extent.setSystemInfo("User Name", "Jignesh Wala");

        return extent;

    }

    public static ExtentReports getReportsObject(){



        ExtentReports extent = new ExtentReports();
        String path = System.getProperty("user.dir")+"\\reports\\AG&N_index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Web Automation Test");
        reporter.config().setDocumentTitle("AG&P Testing");

        extent.attachReporter(reporter);

        extent.setSystemInfo("AGP","Testing");
        extent.setSystemInfo("Environment", "Production");
        extent.setSystemInfo("User Name", "Jignesh Wala");
        reporter.config().setDocumentTitle("AG&P ");
        // Name of the report
        reporter.config().setReportName("AG&P Testing");
        // Dark Theme
        reporter.config().setTheme(Theme.STANDARD);
        return extent;

    }



}
