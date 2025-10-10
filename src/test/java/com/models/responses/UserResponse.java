package com.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse {
    private Data data;
    private Support support;

    @JsonProperty("_meta")  // because JSON key has underscore
    private Meta meta;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
