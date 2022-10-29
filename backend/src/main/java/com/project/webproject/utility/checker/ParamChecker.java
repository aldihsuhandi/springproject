package com.project.webproject.utility.checker;

import com.project.webproject.utility.Enum.ErrorCodeEnum;
import com.project.webproject.utility.StringUtil;
import com.project.webproject.utility.exception.SpringException;

public class ParamChecker {
    private static void throwException(String paramName, ErrorCodeEnum errorCode) throws SpringException {
        throw new SpringException(paramName, errorCode);
    }

    public static void isNotNull(Object o, String paramName) throws SpringException {
        if (o == null) {
            throwException(String.format("%s is null", paramName), ErrorCodeEnum.PARAM_ILLEGAL);
        }
    }

    public static void isNotEmpty(String val, String paramName) throws SpringException {
        if (StringUtil.isEmpty(val)) {
            throwException(String.format("%s is empty", paramName), ErrorCodeEnum.PARAM_ILLEGAL);
        }
    }

    public static void isEmail(String val, String paramName) throws SpringException {
        String emailRegex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
        if (!StringUtil.isMatch(val, emailRegex)) {
            throwException(String.format("%s is not expected", paramName), ErrorCodeEnum.PARAM_ILLEGAL);
        }
    }

    public static void isAlphaNumeric(String val, String paramName) throws SpringException {
        if (!StringUtil.isAlphaNumeric(val)) {
            throwException(String.format("%s must be alphanumeric", paramName), ErrorCodeEnum.PARAM_ILLEGAL);
        }
    }
}
