package com.it.program2;

public class JD implements Switch_ {
    private String name;
    private boolean status;

    public JD() {
    }

    public JD(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isStatus() {
        return status?"打开":"关闭";
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean change(int id) {
        if (id==1) {
            if (status==true) {
                System.out.println("已经打开了，无需再打开");
                return false;
            }else{
                status=true;
                System.out.println(name+"已打开");
                return true;
            }
        } else if(id==2){
            if (status==false) {
                System.out.println("已经关闭了，无需再关闭");
                return false;
            }else{
                status=false;
                System.out.println(name+"已关闭");
                return true;
            }
        }else{
            System.out.println("输入错误，只能输入1和2！");
            return false;
        }
    }
}
