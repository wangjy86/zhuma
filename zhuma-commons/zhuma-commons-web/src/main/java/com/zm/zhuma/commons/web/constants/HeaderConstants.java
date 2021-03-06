package com.zm.zhuma.commons.web.constants;

import com.zm.zhuma.commons.enums.CallSourceEnum;

/**
 * @desc Header的key罗列
 * 
 * @author zhumaer
 * @since 8/31/2017 3:00 PM
 */
public class HeaderConstants {

	/**
	 * 用户的登录token
	 */
	public static final String X_TOKEN = "X-Token";

	/**
	 * api的版本号
	 */
	public static final String API_VERSION = "Api-Version";

	/**
	 * app版本号
	 */
	public static final String APP_VERSION = "App-Version";

	/**
	 * 调用来源 {@link CallSourceEnum}
	 */
	public static final String CALL_SOURCE = "Call-Source";

}
