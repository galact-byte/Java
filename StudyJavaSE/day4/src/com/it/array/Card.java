package com.it.array;

public class Card {
    public static void main(String[] args) {
        printCard();
    }
    public static void printCard(){
        String[] poker=new String[54];
        String[] colors={"红桃","黑桃","梅花","方块"};
        String[] numbers={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        int index=0;
        for(int i=0;i<colors.length;i++){
            String color=colors[i];
            for(int j=0;j<numbers.length;j++){
                String number=numbers[j];
                poker[index]=color+number;
                index++;
            }
        }
        poker[index]="小王";
        poker[index+1]="大王";
        for(String card:poker){
            System.out.print(card+" ");
        }
//        System.out.println("****************************");
        System.out.println();
        shuffle(poker);
        System.out.println("洗牌后为:");
        for(String card:poker){
            System.out.print(card+" ");
        }
    }
    public static void shuffle(String[] poker){
        for(int i=0;i<poker.length;i++){
            int index=(int)(Math.random()*poker.length);
            String temp=poker[i];
            poker[i]=poker[index];
            poker[index]=temp;
        }
    }
}
