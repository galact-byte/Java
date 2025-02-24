package com.it.program;

public class GoldCard extends Card{
    public GoldCard() {
    }

    public GoldCard(String number, String name, int telenumber, double remain) {
        super(number, name, telenumber, remain);
    }

    //余额
    public void firstput(double money){
        if(money<5000){
            System.out.println("首次办理金卡存入金额不能小于5000元");
        }else{
            System.out.println("首次办理金卡存入金额为"+money+"元");
        }
    }
    public void pay(double cost){
        double discount=this.getRemain();
        cost=0.8*cost;
        if(cost<=discount){
            discount=discount-cost;
            this.setRemain(discount);
            System.out.println("消费后余额为"+this.getRemain()+"元");
            int count=(int)(cost/200);
            if(count>0){
                System.out.println("恭喜获得"+count+"次免费洗车服务");
            }
        }else{
            System.out.println("余额不足，请充值");
        }
    }
}
