package org.colin.project.sns.common.errorcode;

import org.colin.project.sns.common.enums.BizType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hzlinqiang
 * @Title BasicConstants.java
 * @Package org.colin.project.sns.common.errorcode
 * @Description 类描述
 * @date 2018-12-30 20:14
 * @since [产品/模块版本] （可选）
 */
public class BasicRespCode {
    protected BizType bizType;
    protected String code;
    public String desc;

   public BasicRespCode(BizType bizType, String subCode, String desc){
       this.bizType = bizType;
       this.code = bizType.getBizCode() + subCode;
       this.desc = desc;
   }

    public BizType getBizType() {
        return bizType;
    }

    public void setBizType(BizType bizType) {
        this.bizType = bizType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
