/**
 * In this class contains utility methods in framework level
 *  1)CaptureScreenshot(String Filename)
 * Author:Basheer Ahamed
 * Date:02/19/2021
 */

package framework;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class utility extends webBrowser {

    //Capture Screenshot and store in the folder
    public static void CaptureScreenshot(String Filename) throws IOException {

        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyHHmmss");
        Date date = new Date();
        String d= formatter.format(date);
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("src/test/Screenshots/"+Filename+d+".png"));

    }

}
