package com.my.todolist;

public class TodoDto {
    private Integer id;
    private String content;
    private Boolean done;

    public TodoDto(Integer id, String content, Boolean done) {
        this.id = id;
        this.content = content;
        this.done = done;
    }
    // public TodoDto(){}

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean getDone() {
        return done;

    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
