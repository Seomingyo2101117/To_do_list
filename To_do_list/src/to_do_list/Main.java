package to_do_list;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("\n=== To-Do List ===");
            System.out.println("1. 할 일 추가");
            System.out.println("2. 할 일 삭제");
            System.out.println("3. 할 일 완료 표시");
            System.out.println("4. 할 일 목록 보기");
            System.out.println("5. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 엔터 버퍼 처리

            switch (choice) {
                case 1:
                    System.out.print("할 일 제목 입력: ");
                    String title = scanner.nextLine();
                    todoList.addTodo(title);
                    break;
                case 2:
                    todoList.printTodos();
                    System.out.print("삭제할 번호 입력: ");
                    int removeIndex = scanner.nextInt() - 1;
                    todoList.removeTodo(removeIndex);
                    break;
                case 3:
                    todoList.printTodos();
                    System.out.print("완료할 번호 입력: ");
                    int doneIndex = scanner.nextInt() - 1;
                    todoList.markTodoAsDone(doneIndex);
                    break;
                case 4:
                    todoList.printTodos();
                    break;
                case 5:
                    System.out.println("프로그램 종료.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
