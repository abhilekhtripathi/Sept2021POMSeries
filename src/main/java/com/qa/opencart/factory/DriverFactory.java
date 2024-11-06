package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    public  WebDriver driver ;
    
    public void setup(String browserName) {
    	
    	System.out.println("the browser name is:" + browserName);
    }

}
