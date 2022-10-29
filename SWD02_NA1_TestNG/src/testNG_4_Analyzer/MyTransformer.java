package testNG_4_Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements IAnnotationTransformer{//org.testng.IAnnotationTransformer
	
	//org.testng.annotations.ITestAnnotation//java.lang.reflect.Constructor//java.lang.reflect.Method//
	public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstructor,Method testMethod) {
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
	
}
