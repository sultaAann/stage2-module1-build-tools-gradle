package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        for (String el: args) {
            if (!(StringUtils.isPositiveNumber(el))) return false;
        }
        return true;
    }
}