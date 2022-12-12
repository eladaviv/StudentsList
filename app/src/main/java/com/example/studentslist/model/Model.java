package com.example.studentslist.model;

import com.example.studentslist.R;

import java.util.LinkedList;
import java.util.List;

public class Model {
    public static final Model instance = new Model();

    private Model(){
        for(int i=1;i<=20;i++){
            Student s = new Student("Student Dan",""+i, "052497558"+i,"colman street "+i, false, R.drawable.student_avatar);
            data.add(s);
        }
    }

    List<Student> data = new LinkedList<Student>();

    public List<Student> getAllStudents() {
        return data;
    }
    public void addStudent(Student student){
        data.add(student);
    }
}

