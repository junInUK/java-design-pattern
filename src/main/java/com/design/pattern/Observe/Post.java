package com.design.pattern.Observe;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private List<Observer> observers;
    private String title;

    public Post(String title) {
        this.observers = new ArrayList<Observer>();
        this.title = title;
    }

    public Post(){
        this.observers = new ArrayList<Observer>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyObservers();
    }

    private void notifyObservers() {
        for(Observer observer : this.observers){
            observer.update();
        }
    }

    public void appendObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
}
