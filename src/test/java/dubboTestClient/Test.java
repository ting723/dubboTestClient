package dubboTestClient;

import java.lang.reflect.Method;
import java.nio.charset.Charset;

import zhanglw.dubbo.client.service.TelnetClientExample;

public class Test {

	 public static void main(String[] args)   
	   {     
	        String ip = "localhost";
	        String port = "20880";
	        System.out.print(Charset.defaultCharset());
	           try   
	          {     
	               Method method = TelnetClientExample.class.getMethod("main", String[].class);     
	               method.invoke(null, (Object) new String[] { ip,port });     
	           }   
	           catch (Exception e)   
	          {     
	              e.printStackTrace();     
	           }     
	   } 
}
