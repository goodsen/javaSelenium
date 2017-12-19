import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class demo {
    public static void main(String[] args) {
        //Todo Auto-generated method stub
        WebDriver driver; //定义Driver
        driver = new FirefoxDriver();//打开火狐浏览器

        driver.get("http://www.casicloud.com");//打开云网首页

        //driver.findElement(By.xpath(".//*[@id='login']")).click();//打开登录页面
        driver.findElement(By.id("login")).click();//打开登录页面

        //切换到企业账号登录
        Actions action = new Actions(driver);
        WebElement SWITCH = driver.findElement(By.xpath(".//*[@id='li1']"));//打开云网登录页面
        action.click(SWITCH).perform();

        driver.findElement(By.id("orgSn")).sendKeys("740116");//输入企业号
        driver.findElement(By.id("shortAccount_org")).sendKeys("system");//输入会员用户名
        driver.findElement(By.id("password_org")).sendKeys("123456");//输入密码
        driver.findElement(By.xpath(".//*[@id='fm1']/div[7]/input")).click();//点击登录按钮
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("登录成功");
        driver.quit();//浏览器关闭
        }
}
