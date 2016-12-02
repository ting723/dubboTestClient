package zhanglw.dubbo.test.client.factory;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhanglianwei on 2016/12/2.
 */
public class DubboServiceFactory {

    private ApplicationConfig applicationConfig;

    private RegistryConfig registryConfig;

    private static class SingletonHolder{
        private static DubboServiceFactory INSTANCE = new DubboServiceFactory();
    }

    private DubboServiceFactory() {
        applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-test-client");
        applicationConfig.setVersion("1.1");

        registryConfig = new RegistryConfig();
        registryConfig.setAddress("10.154.82.106:2181?backcup=10.154.82.107:2181,10.154.82.108:2181");

        List<RegistryConfig> registryConfigs = new ArrayList<RegistryConfig>();
        registryConfigs.add(registryConfig);




        applicationConfig.setRegistries(registryConfigs);
    }

    public  static  DubboServiceFactory getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
