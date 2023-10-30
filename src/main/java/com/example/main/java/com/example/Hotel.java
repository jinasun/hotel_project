package main.java.com.example;
import java.util.ArrayList;


public class Hotel {
    private ArrayList<Room> roomList;
    private String name;


    public Hotel(String name) {
        this.name = name;
        this.roomList = new ArrayList <Room>();
    }
    
    public String getName(){
        return this.name;
    }


    public ArrayList <Room> getRoomList(){
        return this.roomList;
    }

    public void setName(String newName){
        this.name = newName;
    }

    // public void setBudget (double newBudget){
    //     this.budget = newBudget;
    // }

    // public void setNumber(int newNumber){
    //     this.number = newNumber;
    // }

    public void setRoomList(ArrayList<Room> newRoomList){
        this.roomList = newRoomList;
    }

    
    public ArrayList<Room> findAvailableRooms(){
        ArrayList<Room> availableRooms = new ArrayList<Room>();
        for(Room room : roomList){
            if (room.isOccupied()==false){
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
    public void bookRooms(int number, double budget){
        ArrayList<Room> affordableRooms = new ArrayList<Room>();
        ArrayList<Room> selectedRooms = this.findAvailableRooms();
        for (Room room : selectedRooms){
            if (room.getPrice()<=budget){
                affordableRooms.add(room);
            }
        }
        
        for (int i = 0; i<affordableRooms.size()-1; i++ ){
            for (int j = 0;j<affordableRooms.size()-i-1;j++){
                if (affordableRooms.get(j).getPrice()>affordableRooms.get(j+1).getPrice()){
                    Room temp = affordableRooms.get(j);
                    affordableRooms.set(j, affordableRooms.get(j+1));
                    affordableRooms.set(j+1,temp);
                }
            }
        }

        
    }

    // public ArrayList<Room> book(int noOfPpl, double budget){
    //     System.out.println(budget);
    //     ArrayList<Room> affordableRooms = new ArrayList<Room>();
    //     ArrayList<Room> selectedRooms = this.availableRooms();
    //     for (Room room : selectedRooms){
    //         if (room.getPrice()<=budget){
    //             affordableRooms.add(room);
    //         }
    //     }
    // }
    
    

    
//for booking, check whether romms available
//loop over room list and fill out all available rooms
//sort available roomlist from lowest to highest price
//iterate through list and see how many rooms you need for no ppl in booking
    
}