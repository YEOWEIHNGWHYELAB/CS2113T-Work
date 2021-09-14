package com.whyelab;

public class Deadline extends Todo {
    protected String by;

    public Deadline(String description, String dateAndTime) {
        super(description);
        this.by = dateAndTime;
    }

    public String getBy() {
        return this.by;
    }

    public void setBy(String setDateAndTime) {
        this.by = setDateAndTime;
    }
}
