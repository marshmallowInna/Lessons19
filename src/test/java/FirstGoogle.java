
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static java.lang.Thread.sleep;

public class FirstGoogle {
    //String url;
    //WebDriver driver;

        @Test
        public void loginTest() throws InterruptedException {
            System.out.println("Starting loginTest");

            System.setProperty("webdriver.chrome.driver", "C:/Users/Inna/WebDriver/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://automationpractice.com");

            // maximize browser window
            driver.manage().window().maximize();
            //String url = "http://automationpractice.com";
            //driver.get(url);
            System.out.println("Page is opened.");
            //clik by button Sign in
            WebElement signInButton = driver.findElement(By.xpath("//a[@class='login']"));//
            signInButton.click();
            System.out.println("clik by button Sign in ");
            // create email - account
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            WebElement enterEmail = driver.findElement(By.xpath("//input[@id='email_create']"));
            enterEmail.sendKeys("Email@gmail.com");
            WebElement createButton = driver.findElement(By.xpath("//button[@id = 'SubmitCreate']"));
            createButton.submit();
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(" Enter email adress");
            ///String url2 = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
            ////driver.get(url2);
            //sleep(3000);
            //navigate().forword(); когда использовать ?
            WebElement selectGender2 = driver.findElement(By.xpath("//input[@id='id_gender2']"));
            selectGender2.click();

            driver.findElement(By.id("customer_firstname")).sendKeys("Inna");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.id("customer_lastname")).sendKeys("Zotova");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.name("enterEmail")).sendKeys("Email@gmail.com");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             driver.findElement(By.name("passwd")).sendKeys("HillelIT");
            //password.sendKeys("HillelIt");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("Email@gmail.com");
            // WebElement dateOfBirthd = driver.findElement(By.name(""));
            //firstName.sendKeys("");


        }
    public void tearDown() throws Exception{
            sleep(1000);
        }
    }

