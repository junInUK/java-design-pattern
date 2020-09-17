package com.design.pattern.Observe;

public abstract class Observer {
    private Post post;

    public Observer(Post post) {
        this.post = post;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public abstract void update();
}
