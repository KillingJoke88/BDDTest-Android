package com.example.demoandroid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInfoController {

    String regex_email = "[A-Za-z0-9](([_\\.\\-]?[a-zA-Z0-9]+)*)@([A-Za-z0-9]+)(([_\\.\\-]?[a-zA-Z0-9]+)*)\\.([A-Za-z]{2,})";
    String regex_password = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    public boolean checkEmailFormat(String email) {
        Pattern pattern = Pattern.compile(regex_email);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean checkPasswordFormat(String password) {
        Pattern pattern = Pattern.compile(regex_password);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
