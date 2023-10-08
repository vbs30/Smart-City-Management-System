package com.company;
import java.util.HashMap;
public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    IDandPasswords(){
        logininfo.put("123","123");
    }
    public HashMap getLoginInfo(){
        return logininfo;
    }
}