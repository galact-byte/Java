package com.it.innerclass;

public class People {
    private int heartbeat=100;
    public class Heart{
        private int heartbeat=80;
        public void show(){
            int heartbeat=200;
            System.out.println(heartbeat);//200
            System.out.println(this.heartbeat);//80
            System.out.println(People.this.heartbeat);
            //200
            //80
            //100
        }
    }

    public static void main(String[] args) {
        People p=new People();
        People.Heart h=p.new Heart();
        h.show();
//        System.out.println(p.heartbeat);
    }
}
