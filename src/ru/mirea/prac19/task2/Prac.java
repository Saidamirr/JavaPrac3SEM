package ru.mirea.prac19.task2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;


class LabClassUI extends JFrame {
    ArrayList<Student> students;
    JTextField searchingSurNameTextField = new JTextField("Фамилия");
    JTextField searchingFirstNameTextField = new JTextField("Имя");
    JTextField searchingMiddleNameTextField = new JTextField("Отчество");
    JButton searchButton = new JButton("Поиск");
    JButton sortButton = new JButton("Сортировка по баллам");
    JLabel label = new JLabel("Поиск");

    public LabClassUI(ArrayList<Student> students) {
        searchButton.setSize(50, 20);
        searchingSurNameTextField.setSize(80, 20);
        searchingFirstNameTextField.setSize(80, 20);
        searchingMiddleNameTextField.setSize(80, 20);
        this.students = students;

        DefaultListModel<String> model = new DefaultListModel<>();
        for (Student student : students) {
            model.addElement(student.toString());
        }
        JList<String> list = new JList<>(model);
        searchButton.addActionListener(e -> {

            if (Objects.equals(searchingSurNameTextField.getText(), "")
                    || Objects.equals(searchingSurNameTextField.getText(), "")
                    || Objects.equals(searchingSurNameTextField.getText(), "")) {
                try {
                    throw new EmptyStringException("Empty field");
                } catch (EmptyStringException ex) {
                    ex.printStackTrace();
                }
            } else {
                Student nStudent = new Student(searchingSurNameTextField.getText(), searchingFirstNameTextField.getText(), searchingMiddleNameTextField.getText());
                if (students.contains(nStudent)) {
                    model.clear();
                    for (Student student : students) {
                        if (student.equals(nStudent))
                            model.addElement(student.toString());
                    }
                } else {
                    try {
                        throw new StudentNotFoundException("Student -" + nStudent + "not found");
                    } catch (StudentNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        sortButton.addActionListener(e -> {
            SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
            sortingStudentsByGPA.quickSort(students, 0, students.size() - 1);
            model.clear();
            for (Student student : students) {
                model.addElement(student.toString());
            }
        });
        setLayout(new FlowLayout());
        add(label);
        add(searchingSurNameTextField);
        add(searchingFirstNameTextField);
        add(searchingMiddleNameTextField);
        add(searchButton);
        add(sortButton);
        add(list);
    }
}

class Student {
    private final String surName;
    private final String firstName;
    private final String middleName;
    private float score;

    public Student(String surName, String firstName, String middleName) {
        this.surName = surName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public Student(String surName, String firstName, String middleName, float score) {
        this.surName = surName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        if (!Objects.equals(surName, student.surName)) return false;
        if (!Objects.equals(firstName, student.firstName)) return false;
        return Objects.equals(middleName, student.middleName);
    }

    public float getScore() {
        return score;
    }

    @Override
    public String toString() {
        return
                surName + " " + firstName + " " + middleName + " " + score;
    }
}

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o2.getScore(), o1.getScore());
    }

    public void quickSort(ArrayList<Student> students, int low, int high) {
        if (students.size() == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student opora = students.get(middle);
        int i = low, j = high;
        while (i <= j) {
            while (compare(students.get(i), opora) > 0) {
                i++;
            }

            while (compare(students.get(j), opora) < 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(students, low, j);

        if (high > i)
            quickSort(students, i, high);
    }
}

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String er) {
        super(er);
    }
}

class EmptyStringException extends Exception {
    public EmptyStringException(String er) {
        super(er);
    }
}

public class Prac {
    public static void main(String[] args) {
        new LabClass();
    }
}

class LabClass {
    ArrayList<Student> studentArrayList = new ArrayList<>();

    LabClass() {
        studentArrayList.add(new Student("Валенский", "Ибрагим", "Петрович", 2.9F));
        studentArrayList.add(new Student("Брагин", "Александр", "Владимирович", 3.9F));
        studentArrayList.add(new Student("Борзиков", "Иван", "Кантемирович", 3.1F));
        studentArrayList.add(new Student("Мацокина", "Александра", "Ивановна", 4.9F));
        studentArrayList.add(new Student("Луковников", "Дмитрий", "Петрович", 5.0F));
        studentArrayList.add(new Student("Елькин", "Александр", "Иосифович", 1.4F));
        studentArrayList.add(new Student("Трушин", "Борис", "Викторович", 4.1F));
        studentArrayList.add(new Student("Жириновский", "Владимир", "Вольфович", 3.2F));
        studentArrayList.add(new Student("Жидков", "Павел", "Александрович", 4.4F));
        studentArrayList.add(new Student("Черных", "Александр", "Владимирович", 5.0F));

        LabClassUI labClassUI = new LabClassUI(studentArrayList);
        labClassUI.setSize(1200, 300);
        labClassUI.setVisible(true);
    }
}