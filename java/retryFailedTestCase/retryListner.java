package retryFailedTestCase;

import java.lang.reflect.Constructor;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

/*using IAnnotationTransformer(listner) interface we can Automated means re-run failed test case at run time 
 in setRetryAnalyzer(IretryAnalyzerImplemented Class name.class keyword)
 Bz its listners we can run this through XML file */

public class retryListner implements IAnnotationTransformer 
{
	public void transform(ITestAnnotation testAnnotation ,Class testClass,Constructor testConstructor, Method testMethod) 
	{
		testAnnotation.setRetryAnalyzer(IretryAnalyzer.class);
	}	
	
}
