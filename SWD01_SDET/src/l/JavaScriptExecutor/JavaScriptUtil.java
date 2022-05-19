//RememberInSequence:3>8>5>6>7>1>2>4>
package l.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	//1*:Flashing//
	public static void flash(WebElement element,WebDriver dr) {		
		//explicit typecasting WebDriver->JavascriptExecutor//
		//JavascriptExecutor js=(JavascriptExecutor)dr;
		
		String bgcolor=element.getCssValue("backgroundColour");//green
		
		for(int i=0;i<500;i++) {
			changeColor("#000000",element,dr);//1
			changeColor(bgcolor,element,dr);//2			
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver dr) {		
		//explicit typecasting WebDriver->JavascriptExecutor//
		JavascriptExecutor js=(JavascriptExecutor)dr;		
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {
			
		}
	}
	
	//2*:DrawBorder//	
	public static void drawBorder(WebElement element,WebDriver dr) {
		//explicit typecasting WebDriver->JavascriptExecutor//
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	//4:CaptureTitleOfPage//
	public static String getTitleByJs(WebDriver dr) {
		//explicit typecasting WebDriver->JavascriptExecutor//
		JavascriptExecutor js=(JavascriptExecutor)dr;
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	
	//5*:ClickingOnElement//
	public static void clickElementByJs(WebElement element,WebDriver dr) {
		//explicit typecasting WebDriver->JavascriptExecutor//
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].click();", element);		
	}
	
	//6*:GenerateAlert//
	public static void generateAlert(WebDriver dr,String msg) {
		//explicit typecasting WebDriver->JavascriptExecutor//
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("alert('"+msg+"')");
	}
		
	//7*:RefreshBrowser//
	public static void refreshBrowserByJs(WebDriver dr) {
		//explicit typecasting WebDriver->JavascriptExecutor//
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("history.go(0)");		
	}
	
	//8a*:ScrollDownUptoSelectedElement//
	public static void scrollIntoView(WebElement element,WebDriver dr) {
		//explicit typecasting WebDriver->JavascriptExecutor//
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("arguments[0].scrollIntoView(true);",element);	
	}
	
	//8b*:ScrollDownPageTillEnd//
	public static void scrollPageDown(WebDriver dr) {
		//explicit typecasting WebDriver->JavascriptExecutor//
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");			
	}	
}
