package com.re100io.agileplatform.entity;

import java.util.Date;

public class BacklogItemTags {
    private Long id;

    private Long backlogItemId;

    private Long tagId;

    private Date createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBacklogItemId() {
        return backlogItemId;
    }

    public void setBacklogItemId(Long backlogItemId) {
        this.backlogItemId = backlogItemId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}