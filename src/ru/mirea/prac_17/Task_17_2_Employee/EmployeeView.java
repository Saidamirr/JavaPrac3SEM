package Task_17_2_Employee;

public class EmployeeView {
    public void printEmployeeSalary(String name, int hours, int rate){
        //можно изменить логику расчёта зарплаты
        System.out.println(name +"'s salary for this month: " + (hours*rate) + "p");
    }

}
