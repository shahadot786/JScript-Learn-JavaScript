package com.javascript.jscript.Model;

public class DashboardModel {

    private String postId,questions,description,postedBy;
    private long postedAt;

    public DashboardModel(String postId, String questions, String description, String postedBy, long postedAt) {
        this.postId = postId;
        this.questions = questions;
        this.description = description;
        this.postedBy = postedBy;
        this.postedAt = postedAt;
    }

    public DashboardModel() {
    }


    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public long getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(long postedAt) {
        this.postedAt = postedAt;
    }
}
