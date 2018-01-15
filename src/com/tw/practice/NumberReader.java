package com.tw.practice;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class NumberReader {
    private Scanner scanner = new Scanner(System.in);

    public String read() throws Exception {
        String inputNumber = scanner.next();
        if (StringUtils.isNumeric(inputNumber) && inputNumber.length() == 4) {
            if(isRepeat(inputNumber)){ throw new Exception("Input should not be repeated"); }
            return inputNumber;
        }
        throw new Exception("Invalid Input");
    }

    private Boolean isRepeat(String inputNumber) {
        Boolean result = false;
        for (int i = 0; i < 4; i++) {
            if(inputNumber.substring(i + 1, 4).contains(inputNumber.substring(i, i + 1))){ result = true; }
        }
        return result;
    }
}
