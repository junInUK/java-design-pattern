package com.design.pattern.singleton.hungry;

import com.design.pattern.singleton.multi_thread.Singleton;

public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry("Hungry");
    public String value;

    private SingletonHungry(String value){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonHungry getInstance(String value){
        return instance;
    }
}
