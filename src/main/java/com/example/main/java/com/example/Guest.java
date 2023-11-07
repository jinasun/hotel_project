package main.java.com.example;

public class Guest {
    private boolean breakfast;
    private int id;

    public Guest(int id, boolean breakfast) {
        this.id = id;
        this.breakfast = breakfast;
    }

    public int getID(){
        return this.id;
    }

    public boolean isBreakfast(){
        return this.breakfast;
    }

    public void setID(int newID){
        this.id = newID;
    }

    public void setBreakfast(boolean newBreakfast){
        this.breakfast = newBreakfast;
    }

}
