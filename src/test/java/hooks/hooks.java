package hooks;

import Utility.BrowserDriver;
import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import io.cucumber.java.Before;
import io.cucumber.java.After;


public class hooks {

//    @Before
//    public void beforeScenario() {
//        BrowserDriver.driver = new EdgeDriver();
//        System.out.println("duplicate browser");
//        BrowserDriver.driver.manage().window().maximize();
//    }

    @After
    public void afterScenario(Scenario scenario) {
            TakesScreenshot ss = (TakesScreenshot) BrowserDriver.driver;
            File screenshot = ss.getScreenshotAs(OutputType.FILE);

            String timstamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String screenshotName = "screenshot_" + scenario.getName() + "_" + timstamp + ".png";

            File destination = new File("target/screenshots/" + screenshotName);
            destination.getParentFile().mkdirs(); // Ensure the directory exists

            try {
                FileUtils.copyFile(screenshot, destination);
                System.out.println("Screenshot saved at: " + destination.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (BrowserDriver.driver != null) {
                BrowserDriver.driver.quit();
               BrowserDriver.driver = null;
            }
    }
}