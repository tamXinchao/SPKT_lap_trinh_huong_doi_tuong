package com.lap_trinh_huong_doi_tuong.model;

public class Student {
    private String id;
    private String name;
    private int age;

    // Constructor mặc định
    public Student() {}

    // Constructor có tham số
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("Mã SV: " + id);
        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("------------------------");
    }
}
