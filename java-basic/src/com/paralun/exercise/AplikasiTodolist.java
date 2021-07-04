package com.paralun.exercise;

public class AplikasiTodolist {

    static String[] model = new String[5];

    public static void main(String[] args) {
        // Add Todo List
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");

        // View Todo List
        viewTodoList();

        // Remove Todo List
        removeTodoList(1);

        // View after Remove
        viewTodoList();

    }

    /**
     * View todo list
     */
    static void viewTodoList() {
        var no = 1;
        for (var todo : model) {
            if (todo != null) {
                System.out.println(no + ". " + todo);
                no++;
            }
        }
    }

    /**
     * Check Capacity Model
     */
    static Boolean isFull() {
        for (var todo : model) {
            if (todo == null) {
                return false;
            }
        }

        return true;
    }

    /**
     * Add todo list
     */
    static void addTodoList(String todo) {

        if (isFull()) {
            var temp = model;
            model = new String[model.length * 2];

            for (var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    /**
     * Remove todo list
     */
    static void removeTodoList(Integer number) {
        if ((number -1) >= model.length) {
            System.out.println("Number not found");
        }else if (model[number -1] == null) {
            System.out.println("Todo List not found");
        }else {
            for (int i = (number -1); i < model.length; i++) {
                if (i == (model.length -1)) {
                    model[i] = null;
                }else {
                    model[i] = model[i + 1];
                }
            }
        }
    }
}
