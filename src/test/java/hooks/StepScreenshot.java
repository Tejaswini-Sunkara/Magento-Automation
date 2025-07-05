package hooks;

import Utility.BrowserDriver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class StepScreenshot {

    @AfterStep
    public void takeScreenshotAfterStep(Scenario scenario) {
        if (BrowserDriver.driver != null) {
            byte[] screenshot = ((TakesScreenshot) BrowserDriver.driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        }
    }

