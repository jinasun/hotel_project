package main.java.com.example;

public class Person {
    private int age;
    private String sex;
    private String name;
    private double weight;
    private double height;

    public Person(int age, String sex, String name, double weight, double height) {
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public int getAge(){
        return this.age;
    }

    public String getSex(){
        return this.sex;
    }

    public String getName(){
        return this.name;
    }

    public double getWeight(){
        return this.weight;
    }

    public double getHeight(){
        return this.height;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setSex(String newSex){
        this.sex = newSex;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setWeight(double newWeight){
        this.weight = newWeight;
    }

    public void setHeight(double newHeight){
        this.height = newHeight;
    }

}