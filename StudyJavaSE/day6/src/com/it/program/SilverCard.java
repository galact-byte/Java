package com.it.program;

public class SilverCard extends Card{
    public SilverCard() {
    }

    public SilverCard(String number, String name, int telenumber, double remain) {
        super(number, name, telenumber, remain);
    }

    public void firstput(double money){
        if (money<2000){
            System.out.println("首次办理银卡存入金额不能小于2000");
        }else{
            System.out.println("首次办理银卡存入金额为"+money+"元");
        }
    }
    public void pay(double cost){
        double discount=this.getRemain();
        cost=0.9*cost;
        if(cost<discount){
            discount=discount-cost;
            this.setRemain(discount);
            System.out.println("消费后余额为:"+this.getRemain()+"元");
        }
    }
}
