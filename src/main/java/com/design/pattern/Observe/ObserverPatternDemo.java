package com.design.pattern.Observe;

public class ObserverPatternDemo {
    public static void main(String[] args){
        Post post = new Post();

        Observer postowner = new PostOwner(post);
        Observer postjoiner1 = new PostJoiner(post);

        System.out.println("Post title changed to [My first post]");
        post.setTitle("My first post");
        System.out.println("Post title changed to [Thanks for your guys help]");
        post.setTitle("Thanks for your guys help");
    }
}
