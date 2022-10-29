package Task_17_2_Employee;

public class Employee {
    private String name;
    private int workedHours;
    private int rate;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

}
