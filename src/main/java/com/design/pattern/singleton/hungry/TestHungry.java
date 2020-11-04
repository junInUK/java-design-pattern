package com.design.pattern.singleton.hungry;

import com.design.pattern.singleton.multi_thread.DemoMultiThread;
import com.design.pattern.singleton.multi_thread.Singleton;

public class TestHungry {
    public static void main(String[] args){
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new TestHungry.ThreadFoo());
        Thread threadBar = new Thread(new TestHungry.ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable{

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Foo");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable{

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Bar");
            System.out.println(singleton.value);
        }
    }
}
