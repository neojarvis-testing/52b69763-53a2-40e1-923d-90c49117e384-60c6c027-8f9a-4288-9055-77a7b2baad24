package uistore;
 
import org.openqa.selenium.By;
 
public class HomePageLocators_Kasak {
 
    public static By cookies = By.cssSelector("button[id='onetrust-accept-btn-handler']");
 
    public static By aboutMayors = By.xpath("//a[contains(text(),'About Mayors')]");
    public static By pressRoom = By.xpath("//a[contains(text(),'Press Room')]");  
    public static By careers =  By.cssSelector("a[href='https://usacareers.thewosgroup.com/jobs/divisions/mayors/']");
 
    public static By sustainability = By.cssSelector("a[href='/sustainability']");
 
    public static By newsletter = By.cssSelector("li a[href='/newsletter-sign-up']");
    public static By wedding = By.xpath("(//a[@href='/wedding'])[8]");
    public static By rolex  = By.xpath("(//a[contains(text(),'Rolex')])[13]");     
 
    public static By brands = By.cssSelector("li a[href='/c/Brands/']");
    public static By keyword = By.xpath("//span[contains(text(),'About Mayors')]");
    
}
