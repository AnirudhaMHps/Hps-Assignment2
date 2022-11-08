package com.highpeak.anirudha;

public class Greeter {
    String name;
    Greeter(String name){
        this.name=name;
    }
    public String sayHello(){
        return "hello, "+name +"!";
    }
    public String sayGoodbye(){
        return "Goodbye, "+name +"!";
    }
}
