package com.agp.qa.extentReportListeners;

import com.agp.qa.util.ExtentReporterNG;
import com.agp.qa.util.TestUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ListenerTest extends TestUtil implements ITestListener
{
    ExtentTest test;
    ExtentReports extent = ExtentReporterNG.getReportObject();
    // When Test case get failed, this method is called.
    @Override
    public void onTestFailure(ITestResult Result)
    {
        test.fail(Result.getThrowable());
        try {
            driver = (WebDriver) Result.getTestClass().getRealClass().getField("driver").get(Result.getInstance());
        }catch (Exception el){
            el.printStackTrace();
        }
        String filePath = null;
        try {
             filePath = getScreenShot(Result.getMethod().getMethodName(), driver);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test.addScreenCaptureFromPath(filePath, Result.getMethod().getMethodName());

        test.log(Status.FAIL,"Test Failed");
        System.out.println("The name of the testcase failed is :"+ Result.getName());

//

    }



    // When Test case get Skipped, this method is called.
    @Override
    public void onTestSkipped(ITestResult Result)
    {
        System.out.println("The name of the testcase Skipped is :"+Result.getName());
    }

    // When Test case get Started, this method is called.
    @Override
    public void onTestStart(ITestResult Result)
    {
        test = extent.createTest(Result.getMethod().getMethodName());
        System.out.println(Result.getName()+" test case started");
    }

    // When Test case get passed, this method is called.
    @Override
    public void onTestSuccess(ITestResult Result)
    {
        test.log(Status.PASS,"Passed");
        System.out.println("The name of the testcase passed is :"+Result.getName());
    }

    @Override
    public void onFinish(ITestContext Result)
    {

        extent.flush();
    }

    @Override
    public void onStart(ITestContext Result)
    {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
    {

    }

}
