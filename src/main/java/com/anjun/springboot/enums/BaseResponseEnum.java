package com.anjun.springboot.enums;

import com.dataofx.base.enums.CommonResponseEnum;

public enum BaseResponseEnum implements CommonResponseEnum {
    DATA_PERMISSION_INVALID(110001, "数据权限错误"),
    AUTH_INVALID(110002, "认证错误"),
    NO_DATA(110003, "数据不存在"),
    BEGINTIME_BIG_THAN_ENDTIME(110004, "开始时间不能大于结束时间"),
    DAY_CAN_NOT_MORE_THAN_30(110005, "时间范围差不能大于一个月"),
    NO_DATA_PERMISSION(110006, "无该数据权限"),
    PASSWORD_NOT_VALID(110006, "密码不一致"),
    ;

    /**
     * 枚举值
     */
    private int code;

    /**
     * 枚举描述
     */
    private String message;

    /**
     * 构造一个<code>DictEnum</code>枚举对象
     *
     * @param code
     * @param message
     */
    BaseResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @return Returns the code.
     */
    @Override
    public int code() {
        return code;
    }


    /**
     * @return Returns the message.
     */
    @Override
    public String message() {
        return message;
    }

}
