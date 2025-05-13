package to_do_list;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Todo> todos;

    public TodoList() {
        todos = new ArrayList<>();
    }

    public void addTodo(String title) {
        todos.add(new Todo(title));
    }

    public void removeTodo(int index) {
        if (index >= 0 && index < todos.size()) {
            todos.remove(index);
        } else {
            System.out.println("잘못된 인덱스입니다.");
        }
    }

    public void markTodoAsDone(int index) {
        if (index >= 0 && index < todos.size()) {
            todos.get(index).markAsDone();
        }
    }

    public void markTodoAsNotDone(int index) {
        if (index >= 0 && index < todos.size()) {
            todos.get(index).markAsNotDone();
        }
    }

    public void printTodos() {
        if (todos.isEmpty()) {
            System.out.println("할 일이 없습니다.");
        } else {
            for (int i = 0; i < todos.size(); i++) {
                System.out.println(i + 1 + ". " + todos.get(i));
            }
        }
    }
}
