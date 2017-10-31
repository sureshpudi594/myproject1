package JAVA;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\Softwares\\Selenium softwares\\geckodriver.exe");
		FirefoxDriver fp=new FirefoxDriver();
		fp.get("http://google");

	}

}
