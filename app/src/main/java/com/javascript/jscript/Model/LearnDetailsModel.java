package com.javascript.jscript.Model;

public class LearnDetailsModel {
    private String title, details, codes, output;

    public LearnDetailsModel(String title, String details, String codes, String output) {
        this.title = title;
        this.details = details;
        this.codes = codes;
        this.output = output;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
