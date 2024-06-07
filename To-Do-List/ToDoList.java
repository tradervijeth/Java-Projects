package com.mycompany.todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDoItem> items;

    public ToDoList() {
        this.items = new ArrayList<>();
    }

    public void add(ToDoItem item) {
        items.add(item);
    }

    public List<ToDoItem> getItems() {
        return items;
    }

    public boolean remove(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            return true;
        }
        return false;
    }
}
