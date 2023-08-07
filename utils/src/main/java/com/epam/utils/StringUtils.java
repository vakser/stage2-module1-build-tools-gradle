package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (org.apache.commons.lang3.math.NumberUtils.isCreatable(str)) {
            return org.apache.commons.lang3.math.NumberUtils.toDouble(str) > 0.0;
        } else {
            return false;
        }
    }
}
