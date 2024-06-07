package com.mycompany.todo;

public class ToDoItem {
    private String description;

    public ToDoItem(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
