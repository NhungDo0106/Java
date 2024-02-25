package Listeners;

import drivers.DriverManager;
import helpers.CaptureHelper;
import helpers.PropertiesHelper;
import keywords.WebUI;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub
        System.out.println("onStart: " + arg0.getName());

    }

    @Override
    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("onTestStart: " + arg0.getName());
        CaptureHelper.startRecord(arg0.getName());
    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("onTestSuccess: " + arg0.getName());
        CaptureHelper.captureScreenshot(arg0.getName());
        CaptureHelper.stopRecord();

    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("onTestFailure: " + arg0.getName());
        CaptureHelper.captureScreenshot(arg0.getName());
        CaptureHelper.stopRecord();

    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("onTestSkipped: " + arg0.getName());
        CaptureHelper.stopRecord();

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("onTestFailedButWithinSuccessPercentage: " + arg0.getName());

    }


    @Override
    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub
        System.out.println("onFinish: " + arg0.getName());

    }
}
