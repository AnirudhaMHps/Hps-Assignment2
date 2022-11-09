package com.highpeak.anirudha;

public class Greeter {
    String name;

    public Greeter(String name) {
        this.name = name;
    }
    public String sayHello(){
       return "Hello, "+name+"!";
    }
   public  String sayGoodBye(){
        return "GoodBye, "+name+"!";
   }
}