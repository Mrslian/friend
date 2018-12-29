package com.sd.friend.pojo;

public class SysAttestation {
    private Integer aId;

    private String identityZUrl;

    private String identityFUrl;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getIdentityZUrl() {
        return identityZUrl;
    }

    public void setIdentityZUrl(String identityZUrl) {
        this.identityZUrl = identityZUrl == null ? null : identityZUrl.trim();
    }

    public String getIdentityFUrl() {
        return identityFUrl;
    }

    public void setIdentityFUrl(String identityFUrl) {
        this.identityFUrl = identityFUrl == null ? null : identityFUrl.trim();
    }
}