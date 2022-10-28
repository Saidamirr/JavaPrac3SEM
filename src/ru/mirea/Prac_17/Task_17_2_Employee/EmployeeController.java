package Task_17_2_Employee;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view){
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name){
        model.setName(name);
    }
    public String getEmployeeName(){
        return model.getName();
    }

    public int getEmployeeRate() {
        return model.getRate();
    }

    public int getEmployeeWorkedHours() {
        return model.getWorkedHours();
    }

    public void setEmployeeRate(int rate) {
        model.setRate(rate);
    }

    public void setEmployeeWorkedHours(int workedHours) {
        model.setWorkedHours(workedHours);
    }

    public void printInfo(){
        view.printEmployeeSalary(model.getName(), model.getWorkedHours(), model.getRate());
    }
}
