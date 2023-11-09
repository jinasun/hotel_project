package main.java.com.example;
import java.util.ArrayList;


public class Room {
    private int occupancy;
    private double price;
    private boolean occupied;
    private ArrayList<Guest> guestsList;

    public Room(int occupancy, double price, boolean occupied) {
        this.occupancy = occupancy;
        this.price = price;
        this.occupied = occupied;
        this.guestsList = new ArrayList <Guest>();

    }

    public int getOccupancy(){
        return this.occupancy;
    }

    public double getPrice(){
        return this.price;
    }
    public boolean isOccupied(){
        return this.occupied;
    }

    public ArrayList <Guest> getGuestsList(){
        return this.guestsList;
    }

    public void setOccupancy(int newOccupancy){
        this.occupancy = newOccupancy;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public void setOccupied(boolean newOccupied){
        this.occupied = newOccupied;
    }

    public void setGuestsList(ArrayList<Guest> newGuestsList){
        this.guestsList = newGuestsList;
    }

    public void addGuest(Guest guest){
        this.guestsList.add(guest);
    }

    public void removeGuest (Guest guest){
        this.guestsList.remove(guest);
    }

    
}