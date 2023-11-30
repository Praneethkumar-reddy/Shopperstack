package register;

import org.testng.annotations.Test;

import generic.JavaScriptUtil;
import genericLibrary.Base_Test;

public class UsingJavaScript extends Base_Test {
	
	@Test
	public void test() {
		
		JavaScriptUtil javaUtil=new JavaScriptUtil();
		javaUtil.jsScrollBy(300, 400);
	}

}
