package main.java.com.example;


public class Employee extends Person{
    private String position;
    private int id;

    public Employee (String position,int id, int age, String sex, String name, double weight, double height){
        super(age, sex, name, weight, height);
        this.id = id;
        this.position = position;

    }

    public String getPosition(){
        return this.position;
    }

    public int getId(){
        return this.id;
    }

    public void setPosition(String newPosition){
        this.position = newPosition;
    }

    public void setId(int newId){
        this.id = newId;
    }


}
