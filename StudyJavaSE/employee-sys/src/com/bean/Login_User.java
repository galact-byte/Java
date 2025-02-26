package com.bean;

public class Login_User {
    private String username;
    private String password;
    private String loginName;

    public Login_User() {
    }

    public Login_User(String username, String password, String loginName) {
        this.username = username;
        this.password = password;
        this.loginName = loginName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", loginName='" + loginName + '\'' +
                '}';
    }
}
