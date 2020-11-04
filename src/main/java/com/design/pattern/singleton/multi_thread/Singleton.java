package com.design.pattern.singleton.multi_thread;

/**
 *
 */


public class Singleton {
    //  The field must be declared volatile so tha tdouble check lock would work correctly.
    private static volatile Singleton instance;
    public String value;

    private Singleton(String value){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.value = value;
    }

    public static synchronized Singleton getInstance(String value){
        //  The approach taken here is called double-checked locking(DCL). It exists to prevent
        //  race condition between multiple threads that may attempt to get singleton instance
        //  at the same time, creating separate instances as a result.
        //
        //  It may seem that having the result variable here is completely pointless. There is,
        //  however, a very important caveat when implementing double-checked locking in Java,
        //  which is solved by introducing this local variable.
        if(instance != null){
            return instance;
        }else{

                if(instance == null){
                    instance = new Singleton(value);
                }
                return instance;

        }
    }
}
