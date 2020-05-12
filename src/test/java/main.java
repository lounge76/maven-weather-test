import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {

    public static void main(String args[])
    {
        // saves us from system set property gecko.....
        FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        WebDriver x = new FirefoxDriver();

        x.get("https://lounge76-weather-app.glitch.me/");

    }
}
