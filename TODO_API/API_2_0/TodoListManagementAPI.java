import java.util.HashMap;
import java.util.Map;

public class TodoListManagementAPI {
    // Store todos using a HashMap
    private Map<String, String> todos;

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
        if (task == null || priority == null) {
            System.out.println("Task or priority cannot be null.");
            return;
        }
        // Check if todo already exists
        if (todos.containsKey(task)) {
            System.out.println("Todo with the same task already exists.");
            return;
        }
        // Add the todo to the HashMap
        todos.put(task, priority);
    }

    /**
     * Retrieves the priority of the todo with the given task.
     * @param task The task of the todo.
     * @return The priority of the todo, or null if not found.
     */
    public String getPriority(String task) {
        if (task == null) {
            System.out.println("Task cannot be null.");
            return null;
        }
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
        if (task == null) {
            System.out.println("Task cannot be null.");
            return;
        }
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
        if (task == null) {
            System.out.println("Task cannot be null.");
            return;
        }
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
}
