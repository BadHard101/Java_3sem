package kuznetsov.lab17;

public class MVCPatternDemo {
    private static Employee retrieveEmployeeFromDatabase() {
        Employee employee1 = new Employee("Kitty", 1, 10);
        return employee1;
    }

    public static void main(String[] args) {
        Employee model = retrieveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();

        // Update model data
        controller.setEmployeeName("Doggy");
        controller.setEmployeeId(2);
        controller.setEmployeeSalary(25);
        controller.updateView();
    }
}
