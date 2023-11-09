package main.java.com.example;

public class Guest extends Person {
    private boolean breakfast;
    private int id;

    public Guest( boolean breakfast, int id, int age, String sex, String name, double weight, double height){
        super(age, sex, name, weight, height);
        this.id = id;
        this.breakfast = breakfast;
    }

    public int getID(){
        return this.id;
    }

    public boolean isBreakfast(){
        return this.breakfast;
    }

    // public void setID(int newID){
    //     this.id = newID;
    // }

    // public void setBreakfast(boolean newBreakfast){
    //     this.breakfast = newBreakfast;
    // }

}
