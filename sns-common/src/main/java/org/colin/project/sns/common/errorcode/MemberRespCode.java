package org.colin.project.sns.common.errorcode;

import org.colin.project.sns.common.enums.BizType;

/**
 * @author hzlinqiang
 * @Title MemberECMapping.java
 * @Package org.colin.project.sns.common.errorcode
 * @Description 类描述
 * @date 2018-12-30 20:20
 * @since [产品/模块版本] （可选）
 */
public class MemberRespCode extends BasicRespCode {

    protected MemberRespCode(String subCode, String desc) {
        super(BizType.MEMBER, subCode, desc);
    }
    //============声明响应码==============
    public final static MemberRespCode SUCCESS_CODE=new MemberRespCode("10000","调用成功");

}
