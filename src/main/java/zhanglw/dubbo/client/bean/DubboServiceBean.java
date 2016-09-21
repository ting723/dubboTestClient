package zhanglw.dubbo.client.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhanglianwei on 2016/9/20.
 */
public class DubboServiceBean implements Serializable {

    private String ip;

    private int port;

    private List<InterfaceBean> interfaceBean;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public List<InterfaceBean> getInterfaceBean() {
        return interfaceBean;
    }

    public void setInterfaceBean(List<InterfaceBean> interfaceBean) {
        this.interfaceBean = interfaceBean;
    }
}
