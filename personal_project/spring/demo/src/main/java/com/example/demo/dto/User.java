package com.example.demo.dto;

public class User {
    private int id;
    private String name;
    private int age;
    
    // toString() 메서드를 오버라이드하여 출력할 데이터 형식을 지정합니다.
    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}

