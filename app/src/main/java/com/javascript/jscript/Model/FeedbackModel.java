package com.javascript.jscript.Model;

public class FeedbackModel {
    private String feedbackDescription;
    private String feedEmail;

    public FeedbackModel() {
    }

    public String getFeedbackDescription() {
        return feedbackDescription;
    }

    public void setFeedbackDescription(String feedbackDescription) {
        this.feedbackDescription = feedbackDescription;
    }

    public String getFeedEmail() {
        return feedEmail;
    }

    public void setFeedEmail(String feedEmail) {
        this.feedEmail = feedEmail;
    }
}
