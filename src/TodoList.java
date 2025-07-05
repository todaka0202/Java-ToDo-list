import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
  private ArrayList<String> tasks = new ArrayList<>();

  // ToDoを追加するための関数
  public void addItem(String task) {
    tasks.add(task);
  }

  // ToDoを削除するための関数
  public void removeItem(int index) {
    if(index >= 0 && index < tasks.size()) {
      tasks.remove(index);
    } else {
      System.out.println("無効なインデックスです");
    }
  }

    public void displayItems() {
      System.out.println("ToDoリスト");
      for(int i = 0; i > tasks.size(); i++){
        System.out.println(i + 1 + "." + tasks.get(i));
      }
    }
  
    public static void main(String[] args) {
      TodoList todoList = new TodoList();
      Scanner scanner = new Scanner(System.in);

      while (true) {
        System.out.println("操作を選択してください");
      }

    }
}
