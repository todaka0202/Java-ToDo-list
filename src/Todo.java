import java.util.ArrayList;
import java.util.Scanner;

public class Todo {
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
}
