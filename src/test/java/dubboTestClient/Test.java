package dubboTestClient;

import zhanglw.dubbo.client.service.TelnetClientExample;

import java.lang.reflect.Method;
import java.nio.charset.Charset;

public class Test {

    public static void main(String[] args) {
        String ip = "10.112.82.152";
        String port = "20983";
        System.out.print(Charset.defaultCharset());
        try {
            Method method = TelnetClientExample.class.getMethod("main", String[].class);
            method.invoke(null, (Object) new String[]{ip, port});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
