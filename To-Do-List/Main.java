package com.mycompany.todo;

import java.util.Scanner;

public class Main {
    private static ToDoList toDoList = new ToDoList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("To-Do List Application");
            System.out.println("1. Add a to-do");
            System.out.println("2. List to-dos");
            System.out.println("3. Remove a to-do");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addToDo();
                    break;
                case 2:
                    listToDos();
                    break;
                case 3:
                    removeToDo();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Goodbye!");
    }

    private static void addToDo() {
        System.out.print("Enter the to-do description: ");
        String description = scanner.nextLine();
        toDoList.add(new ToDoItem(description));
        System.out.println("To-do added.");
    }

    private static void listToDos() {
        System.out.println("Your to-dos:");
        for (ToDoItem item : toDoList.getItems()) {
            System.out.println(item);
        }
    }

    private static void removeToDo() {
        System.out.print("Enter the index of the to-do to remove: ");
        int index = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        if (toDoList.remove(index)) {
            System.out.println("To-do removed.");
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }
}
