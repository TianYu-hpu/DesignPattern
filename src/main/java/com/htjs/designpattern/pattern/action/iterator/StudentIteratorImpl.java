package com.htjs.designpattern.pattern.action.iterator;


import java.util.List;

public class StudentIteratorImpl implements StudentIterator {

    private List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    public boolean hasNext() {
        return position < list.size();
    }

    public Student next() {
        Student student = list.get(position);
        position++;
        return student;
    }
}
