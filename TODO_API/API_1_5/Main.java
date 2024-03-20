/**
 * This class extends TodoListManagement and provides functionality to search for todos by task.
 */
@SuppressWarnings("unused")
class TodoListSearch extends TodoListManagement {
    /**
     * Searches for a todo by task and displays the details if found.
     * If the todo is not found, prints an error message.
     * @param task The task of the todo to search for.
     */
    public void searchTodoByTask(String task) {
        // Check if the todo exists
        if (todos.containsKey(task)) {
            // Retrieve the priority associated with the given task
            String priority = todos.get(task);
            // Print todo details
            System.out.println("Todo found: " + task + " - Priority: " + priority);
        } else {
            // Print error message if todo not found
            System.out.println("Todo not found.");
        }
    }
}
/**
 * Main class demonstrating the usage of the TodoListManagementAPI.
 */
public class Main extends TodoListSearch {
    public static void main(String[] args) {
        // Create a new instance of TodoListSearch
        TodoListSearch todoManager = new TodoListSearch();

        // Adding todos
        todoManager.addTodo("Finish project", "High");
        todoManager.addTodo("Buy groceries", "Medium");

        // Getting todo by task
        System.out.println("Priority for 'Finish project': " + todoManager.getPriority("Finish project"));

        // Updating todo priority
        todoManager.updateTodoPriority("Finish project", "Low");

        // Deleting todo
        todoManager.deleteTodo("Buy groceries");

        // Searching todo by task
        todoManager.searchTodoByTask("Finish project");
    }
}
