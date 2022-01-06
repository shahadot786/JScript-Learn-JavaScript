package com.javascript.jscript.Model;

public class UserModel {
    private String userName,email,password;
    private String coverPhoto;
    private String profile;
    private String userID;
    private String checkPremiumID;
    private boolean checkPremium;

    public UserModel() {
    }

    public UserModel(String userName, String email, String password, String coverPhoto, String profile, String userID) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.coverPhoto = coverPhoto;
        this.profile = profile;
        this.userID = userID;
    }

    public UserModel(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public UserModel(String userName, String email, String password, String checkPremiumID, boolean checkPremium) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.checkPremiumID = checkPremiumID;
        this.checkPremium = checkPremium;
    }

    public UserModel(String userName, String email, String profile, String userID, String checkPremiumID, boolean checkPremium) {
        this.userName = userName;
        this.email = email;
        this.profile = profile;
        this.userID = userID;
        this.checkPremiumID = checkPremiumID;
        this.checkPremium = checkPremium;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public boolean isCheckPremium() {
        return checkPremium;
    }

    public void setCheckPremium(boolean checkPremium) {
        this.checkPremium = checkPremium;
    }

    public String getCheckPremiumID() {
        return checkPremiumID;
    }

    public void setCheckPremiumID(String checkPremiumID) {
        this.checkPremiumID = checkPremiumID;
    }
}
