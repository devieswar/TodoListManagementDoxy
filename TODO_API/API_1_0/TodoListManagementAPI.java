import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a simple Todo List Management API.
 */
public class TodoListManagementAPI {
    // Store todos using a HashMap
    Map<String, String> todos;

    /**
     * Constructor to initialize the todo list map.
     */
    public TodoListManagementAPI() {
        // Initialize the HashMap to store todos
        todos = new HashMap<>();
    }

    /**
     * Adds a new todo with the given task and priority.
     * @param task The task to be added to the todo list.
     * @param priority The priority of the task.
     */
    public void addTodo(String task, String priority) {
        // Add the todo to the HashMap
        todos.put(task, priority);
    }

    /**
     * Retrieves the priority of the todo with the given task.
     * @param task The task of the todo.
     * @return The priority of the todo, or null if not found.
     */
    public String getPriority(String task) {
        // Retrieve the priority associated with the given task from the HashMap
        return todos.get(task);
    }

    /**
     * Updates the priority of the todo with the given task.
     * If the todo is not found, prints an error message.
     * @param task The task of the todo to be updated.
     * @param newPriority The new priority to be set.
     */
    public void updateTodoPriority(String task, String newPriority) {
        // Check if the todo exists
        if (todos.containsKey(task)) {
            // Update the priority for the todo
            todos.put(task, newPriority);
            // Print success message
            System.out.println("Todo priority updated successfully.");
        } else {
            // Print error message if todo not found
            System.out.println("Todo not found.");
        }
    }

    /**
     * Deletes the todo with the given task.
     * If the todo is not found, prints an error message.
     * @param task The task of the todo to be deleted.
     */
    public void deleteTodo(String task) {
        // Check if the todo exists
        if (todos.containsKey(task)) {
            // Remove the todo from the HashMap
            todos.remove(task);
            // Print success message
            System.out.println("Todo deleted successfully.");
        } else {
            // Print error message if todo not found
            System.out.println("Todo not found.");
        }
    }

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

    /**
     * Main method demonstrating the usage of the TodoListManagementAPI.
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create a new instance of TodoListManagementAPI
        TodoListManagementAPI todoManager = new TodoListManagementAPI();

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
