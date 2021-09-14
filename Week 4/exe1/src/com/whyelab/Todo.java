package com.whyelab;

class Todo extends Task {
    protected boolean isDone;

    public Todo(String description) {
        super(description);
        this.isDone = false;
    }

    public boolean isDone() {
        return this.isDone;
    }

    public void setDone(boolean done) {
        this.isDone = done;
    }
}
