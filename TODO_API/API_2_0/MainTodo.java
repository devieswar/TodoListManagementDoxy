/**
 * Main class demonstrating the usage of the TodoListManagement class.
 */
@SuppressWarnings("unused")
class MainTodo extends TodoListManagementAPI {
    public static void main(String[] args) {
        // Create a new instance of TodoListManagement
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
    }
}
