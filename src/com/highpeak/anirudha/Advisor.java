package com.highpeak.anirudha;

import java.util.Random;

public class Advisor {
   final String[] message ={"say no", "say yes","Never say no","never say yes ", " say yes"};


    public String getAdvice(){
        Random r = new Random();
        int index = r.nextInt(message.length);
        return message[index];
    }
}
