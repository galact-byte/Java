package com.bean;

public class Login_User { ;
    private String password;
    private String loginName;

    public Login_User() {
    }

    public Login_User(String loginName, String password) {
        this.loginName = loginName;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String toString() {
        return "Login_User{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
