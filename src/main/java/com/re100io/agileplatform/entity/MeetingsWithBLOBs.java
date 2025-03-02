package com.re100io.agileplatform.entity;

public class MeetingsWithBLOBs extends Meetings {
    private String summary;

    private String notes;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }
}