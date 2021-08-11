package org.perscholas.lectures.w5.d1.collections;

public class Student {
    String name;
    int id;
    String major;

    public Student(String name, int id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", major='" + major + '\'' +
                '}';
    }
}
