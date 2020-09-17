package com.design.pattern.Observe;

public class PostJoiner extends Observer{

    public PostJoiner(Post post) {
        super(post);
        super.getPost().appendObserver(this);
    }

    @Override
    public void update() {
        System.out.println("PostJoiner has been update the post title:"
                + super.getPost().getTitle());
    }
}
