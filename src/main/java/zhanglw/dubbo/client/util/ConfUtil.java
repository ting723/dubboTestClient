package zhanglw.dubbo.client.util;

import org.ho.yaml.Yaml;
import zhanglw.dubbo.client.bean.DubboServiceBean;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by zhanglianwei on 2016/9/20.
 */
public class ConfUtil {

    private static String confPath = "";

    private static InputStream is = null;

    public static <T> T getBean(Class<T> c, String path) {
        if (path != null && !"".equals(path)) {
            confPath = path;
        } else {
            confPath = "test-dubbo.yaml";
        }

        T t = null;
        try {
            File file = new File(confPath);
            is = ConfUtil.class.getClass().getResourceAsStream(confPath);
            t = Yaml.loadType(is, c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    public static void main(String[] args) {

        DubboServiceBean dsBean = getBean(DubboServiceBean.class, "/preview-dubbo.yaml");
//      System.out.println(dsBean.getIp());
        System.out.println(ConfUtil.class.getResource("/").getPath());
        File file = new File("E:/ideaEx/dubboTestClient/target/classes/preview-dubbo.yaml");
        System.out.println(file.exists());

    }

}
