import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.io.IOException;
import java.net.URL;

public class Desktop_automation {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime run = Runtime.getRuntime();
        Process proc = run.exec("C:\\Users\\monil.joshi\\Downloads\\Winium.Desktop.Driver\\Winium.Desktop.Driver.exe");
        Thread.sleep(3000);

        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
        driver.findElement(By.name("Two")).click();
        driver.findElement(By.name("Multiply by")).click();
        driver.findElement(By.name("Eight")).click();
        driver.findElement(By.name("Equals")).click();
        driver.close();
        run.exec("taskkill /F /IM Winium.Desktop.Driver.exe");

    }
}
