package org.colin.project.sns.common.bo;

import lombok.Data;
import org.colin.project.sns.common.errorcode.BasicRespCode;

import java.util.Map;

/**
 * @author hzlinqiang
 * @Title ManagerBoResponse.java
 * @Package org.colin.project.sns.common.bo
 * @Description manager模块通用返回
 * @date 2018-12-30 20:09
 * @since [产品/模块版本] （可选）
 */
@Data
public class ManagerGeneralResponse
{
	/**
	 * 状态
	 */
	private String code;
	/**
	 * 描述信息
	 */
	private String message;
	/**
	 * 返回结果
	 */
	private Object data;

	/**
	 * 附件
	 */
	private Map<String, Object> attach;

	public <T extends BasicRespCode> ManagerGeneralResponse(T respCode, Object data, Map<String, Object> attach)
	{
		this.code = respCode.getCode();
		this.message = respCode.getDesc();
		this.attach = attach;
		this.data = data;
	}

	public ManagerGeneralResponse(String code, String message, Object data, Map<String, Object> attach)
	{
		this.code = code;
		this.message = message;
		this.data = data;
		this.attach = attach;
	}
}
