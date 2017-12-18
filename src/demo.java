import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class demo {
    public static void main(String[] args) {
        //Todo Auto-generated method stub
        WebDriver driver; //定义Driver
        driver = new FirefoxDriver();//打开火狐浏览器
        driver.get("http://www.casicloud.com");//打开云网首页
        driver.findElement(By.xpath(".//*[@id='login']")).click();//打开登录页面
        driver.quit();//浏览器关闭
        }
}
