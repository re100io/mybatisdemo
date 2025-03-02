package com.re100io.agileplatform.entity;

import java.util.Date;

public class BacklogHistory {
    private Long id;

    private Long backlogItemId;

    private String field;

    private Long changedBy;

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

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public Long getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(Long changedBy) {
        this.changedBy = changedBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}