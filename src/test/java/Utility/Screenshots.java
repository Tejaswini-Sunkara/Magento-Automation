package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Screenshots {

    public static void takeScreenshot(WebDriver driver, String name) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File ss = new File("target/screenshots");
        if(!ss.exists()) {
            ss.mkdirs();
        }
        File destFile = new File(ss, name + "_" + time + ".png");
        try{
            Files.copy(srcFile.toPath(), destFile.toPath());
            System.out.println("Screenshots saved in"+destFile.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
