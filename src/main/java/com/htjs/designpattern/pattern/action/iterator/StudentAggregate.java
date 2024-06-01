package com.htjs.designpattern.pattern.action.iterator;


public interface StudentAggregate {

    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();

}
