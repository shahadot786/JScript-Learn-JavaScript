package com.javascript.jscript.Model;

public class FeedbackModel {
    private String feedbackDescription;

    public FeedbackModel(String feedbackDescription) {
        this.feedbackDescription = feedbackDescription;
    }

    public FeedbackModel() {
    }

    public String getFeedbackDescription() {
        return feedbackDescription;
    }

    public void setFeedbackDescription(String feedbackDescription) {
        this.feedbackDescription = feedbackDescription;
    }
}
