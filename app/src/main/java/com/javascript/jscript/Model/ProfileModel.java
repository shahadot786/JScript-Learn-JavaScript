package com.javascript.jscript.Model;

public class ProfileModel {

    private String  profession,fbLink,instaLink,githubLink,linkedinLink,twitterLink,userBio;
    public ProfileModel() {
    }

    public ProfileModel(String profession, String fbLink, String instaLink, String githubLink, String linkedinLink, String twitterLink, String userBio) {
        this.profession = profession;
        this.fbLink = fbLink;
        this.instaLink = instaLink;
        this.githubLink = githubLink;
        this.linkedinLink = linkedinLink;
        this.twitterLink = twitterLink;
        this.userBio = userBio;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getFbLink() {
        return fbLink;
    }

    public void setFbLink(String fbLink) {
        this.fbLink = fbLink;
    }

    public String getInstaLink() {
        return instaLink;
    }

    public void setInstaLink(String instaLink) {
        this.instaLink = instaLink;
    }

    public String getGithubLink() {
        return githubLink;
    }

    public void setGithubLink(String githubLink) {
        this.githubLink = githubLink;
    }

    public String getLinkedinLink() {
        return linkedinLink;
    }

    public void setLinkedinLink(String linkedinLink) {
        this.linkedinLink = linkedinLink;
    }

    public String getTwitterLink() {
        return twitterLink;
    }

    public void setTwitterLink(String twitterLink) {
        this.twitterLink = twitterLink;
    }

    public String getUserBio() {
        return userBio;
    }

    public void setUserBio(String userBio) {
        this.userBio = userBio;
    }
}
