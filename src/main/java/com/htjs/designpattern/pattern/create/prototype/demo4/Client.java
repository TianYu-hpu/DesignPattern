package com.htjs.designpattern.pattern.create.prototype.demo4;

import java.io.*;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Student stu = new Student("张三");
        Citation citation1 = new Citation(stu);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/a.txt"));
        oos.writeObject(citation1);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/a.txt"));
        Citation citation2 = (Citation) ois.readObject();
        System.out.println("citation11 == citation2:" + (citation1 == citation2));
        citation2.getStu().setName("李四");
        System.out.println("citation11 == citation2:" + (citation1 == citation2));
        citation1.show();
        citation2.show();

    }

}
