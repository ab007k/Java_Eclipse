package b.headless_testing;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HT3_HtmlUnitDriver {
	public static void main(String[]args) {
		
		HtmlUnitDriver dr=new HtmlUnitDriver();
		
		dr.get("https://demo.nopcommerce.com/");
		System.out.println("Title of Page:>"+dr.getTitle());
		System.out.println("Url of Page:>"+dr.getCurrentUrl());	
		
	}

}
