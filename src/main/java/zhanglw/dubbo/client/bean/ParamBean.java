package zhanglw.dubbo.client.bean;

import java.io.Serializable;

/**
 * Created by zhanglianwei on 2016/9/21.
 */
public class ParamBean implements Serializable {

   private  String paramsType;

   private  String paramsValue;

   public String getParamsType() {
      return paramsType;
   }

   public void setParamsType(String paramsType) {
      this.paramsType = paramsType;
   }

   public String getParamsValue() {
      return paramsValue;
   }

   public void setParamsValue(String paramsValue) {
      this.paramsValue = paramsValue;
   }
}
