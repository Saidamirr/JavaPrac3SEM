package Task_17_1_Student;

public class Student_main {

    public static void main(String[] args) {
        //Контроллер используют model и view
        Student model = retriveFromDB();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.printInfo(); //Выводится инфа в первый раз

        controller.setStudentRollNo("00001"); //можно изменить
        System.out.println("After updating:");
        controller.printInfo(); //Выводится инфа после изменения

    }

    private static Student retriveFromDB(){ // "извлечение из базы данных"
        Student student = new Student();
        student.setName("Jason Statham"); //можно изменить
        student.setRollNo("258"); //можно изменить
        return student;
    }
}





