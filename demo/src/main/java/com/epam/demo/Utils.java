package com.epam.demo;

import java.util.List;
import utils.src.main.java.com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String el: args) {
            if (!(StringUtils.isPositiveNumber(el))) return false;
        }
        return true;
    }
}