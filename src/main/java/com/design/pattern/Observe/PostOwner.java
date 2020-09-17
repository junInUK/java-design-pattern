package com.design.pattern.Observe;

public class PostOwner extends Observer{

    public PostOwner(Post post){
        super(post);
        super.getPost().appendObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Post Owner has been updated the post title:"
                + super.getPost().getTitle());
    }
}
