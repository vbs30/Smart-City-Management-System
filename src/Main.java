package com.company;

public class Main {
    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();
        EmailAndPhone emailandphone = new EmailAndPhone();
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
    }
}
