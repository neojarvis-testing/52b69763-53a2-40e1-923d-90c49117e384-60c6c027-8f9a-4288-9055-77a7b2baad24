package uistore;

import org.openqa.selenium.By;

/**
 * @Created by Ram Prasath
 * @Description This class contains locators for various elements on the home page.
 */
public class HomePage_Locator_Ram {
    
    public static By yoursecurity = By.cssSelector("a[href='/your-security']");
    public static By terms = By.cssSelector("a[href='/terms-and-conditions']");
    public static By PrivacyPolicy = By.cssSelector("li a[href='/privacy-policy']");
    public static By CookiePolicy = By.xpath("(//a[@href='/privacy-policy#cookies'])[1]");
    public static By Accessibility = By.cssSelector("li a[href='/accessibility']");
    public static By PayByLink = By.cssSelector("li a[href='/paybylink-terms']");
    public static By categories = By.xpath("//span[text()='Categories']");
    public static By jwelery = By.cssSelector("div[class='col-md-3 col-sm-12 footerColumn'] ul li a[href='/c/Jewelry/']");
    public static By watches = By.cssSelector("div[class='col-md-3 col-sm-12 footerColumn'] ul li a[href='/c/Watches/']");
    public static By footer = By.xpath("(//span[@class='desktopFooterSectionHeader'])[2]");
    public static By popup = By.cssSelector("button[id='onetrust-accept-btn-handler']");
}
