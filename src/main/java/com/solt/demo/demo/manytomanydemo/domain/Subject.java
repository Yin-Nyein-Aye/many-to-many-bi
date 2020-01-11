package com.solt.demo.demo.manytomanydemo.domain;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
    private int durationMonths;

    @ManyToMany(mappedBy = "subjects")
    private List<Student> students = new ArrayList<>();

    public Subject() {
    }

    public Subject(String name, int durationMonths) {
        this.name = name;
        this.durationMonths = durationMonths;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", durationMonths=" + durationMonths +
                '}';
    }

}
