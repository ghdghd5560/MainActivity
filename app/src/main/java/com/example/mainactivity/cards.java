package com.example.mainactivity;

public class cards {
    private String userId;
    private String name;
    private String profileImageUrl;
    public cards (String userId, String name, String profileImageUrl) {
        this.userId = userId;
        this.name = name;
        this.profileImageUrl = profileImageUrl;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getprofileImageUrl() {
        return name;
    }
    public void setprofileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
}
