package com.it.program1;


public class Furniture {
    private String name;
    private boolean isOn;

    public Furniture() {
    }

    public Furniture(String name) {
        this.name = name;
        this.isOn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
    public String getStatus(){
        return isOn? "开启":"关闭";
    }
}
