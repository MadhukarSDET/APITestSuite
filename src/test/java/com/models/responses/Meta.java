package com.models.responses;

import java.util.List;

public class Meta {
    private String powered_by;
    private String upgrade_url;
    private String docs_url;
    private String template_gallery;
    private String message;
    private List<String> features;
    private String upgrade_cta;

    public String getPowered_by() {
        return powered_by;
    }

    public void setPowered_by(String powered_by) {
        this.powered_by = powered_by;
    }

    public String getUpgrade_url() {
        return upgrade_url;
    }

    public void setUpgrade_url(String upgrade_url) {
        this.upgrade_url = upgrade_url;
    }

    public String getDocs_url() {
        return docs_url;
    }

    public void setDocs_url(String docs_url) {
        this.docs_url = docs_url;
    }

    public String getTemplate_gallery() {
        return template_gallery;
    }

    public void setTemplate_gallery(String template_gallery) {
        this.template_gallery = template_gallery;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public String getUpgrade_cta() {
        return upgrade_cta;
    }

    public void setUpgrade_cta(String upgrade_cta) {
        this.upgrade_cta = upgrade_cta;
    }
}

