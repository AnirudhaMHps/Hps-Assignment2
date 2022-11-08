package com.highpeak.anirudha;

public class Advisor {
    String[] message = new String[5];
    Advisor(String[] message){
        this.message=message;
    }
    public String[] getAdvice(){
        return message;
    }
}
