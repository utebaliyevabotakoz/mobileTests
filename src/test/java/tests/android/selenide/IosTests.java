package tests.android.selenide;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import io.appium.java_client.ios.IOSElement;


@Tag("ios")
public class IosTests extends TestBase {

    @Test
    @DisplayName("Функционал (ios)")
    void main(String[] args) throws MalformedURLException, InterruptedException {

        step("Click Text Button", () -> {
            $(accessibilityId("Text Button")).click();
        });

        step("Click Text Input", () -> {
            $(accessibilityId("Text Input")).click();
            $(accessibilityId("Text Input")).sendKeys("hello@browserstack.com");
        });

        step("Click Text Output", () -> {
            $(accessibilityId("Text Output")).click();

            assertEquals("hello@browserstack.com", $(accessibilityId("Text Input")).getText());
        });
    }
}
//
//package ios;
//        import java.net.URL;
//        import java.util.List;
//        import java.net.MalformedURLException;
//        import org.openqa.selenium.support.ui.WebDriverWait;
//        import org.openqa.selenium.remote.DesiredCapabilities;
//        import org.openqa.selenium.support.ui.ExpectedConditions;
//        import io.appium.java_client.MobileBy;
//        import io.appium.java_client.ios.IOSDriver;
//        import io.appium.java_client.ios.IOSElement;
//public class BrowserStackSample {
//    public static void main(String[] args) throws MalformedURLException, InterruptedException {
//        DesiredCapabilities caps = new DesiredCapabilities();
//
//        // Set your access credentials
//        caps.setCapability("browserstack.user", "botakozutebaliye_FN8sZr");
//        caps.setCapability("browserstack.key", "yZA6t6mFy4Nh9fBvrqzs");
//
//        // Set URL of the application under test
//        caps.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
//
//        // Specify device and os_version for testing
//        caps.setCapability("device", "iPhone XS");
//        caps.setCapability("os_version", "12");
//
//
//        // Set other BrowserStack capabilities
//        caps.setCapability("project", "First Java Project");
//        caps.setCapability("build", "browserstack-build-1");
//        caps.setCapability("name", "first_test");
//
//
//        // Initialise the remote Webdriver using BrowserStack remote URL
//        // and desired capabilities defined above
//        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
//                new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
//
//        // Test case for the BrowserStack sample iOS app.
//        // If you have uploaded your app, update the test case here.
//        IOSElement textButton = (IOSElement) new WebDriverWait(driver, 30).until(
//                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
//        textButton.click();
//        IOSElement textInput = (IOSElement) new WebDriverWait(driver, 30).until(
//                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
//        textInput.sendKeys("hello@browserstack.com");
//        Thread.sleep(5000);
//        IOSElement textOutput = (IOSElement) new WebDriverWait(driver, 30).until(
//                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));
//        if(textOutput != null && textOutput.getText().equals("hello@browserstack.com"))
//            assert(true);
//        else
//            assert(false);
//
//        // Invoke driver.quit() after the test is done to indicate that the test is completed.
//        driver.quit();
//    }
//}