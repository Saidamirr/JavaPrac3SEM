package Task_17_2_Employee;

public class Main_Employee {
    public static void main(String[] args){
    //Контроллер используют model и view
        Employee model = retriveFromDB();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.printInfo();
    }

    private static Employee retriveFromDB(){ // "извлечение из базы данных"
        Employee employee = new Employee();
        employee.setName("Tony Stark"); //можно изменить значения
        employee.setWorkedHours(260);
        employee.setRate(5000);
        return employee;
    }
}
