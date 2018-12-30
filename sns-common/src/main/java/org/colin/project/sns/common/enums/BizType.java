package org.colin.project.sns.common.enums;

/**
 * @author hzlinqiang
 * @Title BizType.java
 * @Package org.colin.project.sns.common.enums
 * @Description 错误码所属业务类型
 * @date 2018-12-30 20:30
 * @since [产品/模块版本] （可选）
 */
public enum BizType {
    SYSTEM("00"),MEMBER("01");
    private String bizCode;

    private BizType(String bizCode)
    {
        this.bizCode = bizCode;
    }

    public String getBizCode()
    {
        return bizCode;
    }

    public static BizType getBizType(String bizCode)
    {
        for (BizType bt : values())
        {
            if (bt.getBizCode().equals(bizCode))
                return bt;
        }
        return null;
    }
}
