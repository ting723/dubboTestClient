package zhanglw.dubbo.client.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by zhanglianwei on 2016/9/20.
 */
public class InterfaceBean implements Serializable {

    private String className;

    private List<Map<String, String>> methods;

    private List<Map<String,String>> paramJson;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Map<String, String>> getMethods() {
        return methods;
    }

    public void setMethods(List<Map<String, String>> methods) {
        this.methods = methods;
    }

}
