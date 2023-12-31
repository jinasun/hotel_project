package main.java.com.example;
import java.util.ArrayList;


public class Hotel {
    private ArrayList<Room> roomList;
    private ArrayList<Employee> employeeList;
    private String name;


    public Hotel(String name) {
        this.name = name;
        this.roomList = new ArrayList <Room>();
        this.employeeList = new ArrayList <Employee>();
    }
    
    public String getName(){
        return this.name;
    }


    public ArrayList <Room> getRoomList(){
        return this.roomList;
    }

    public ArrayList <Employee> getEmployees(){
        return this.employeeList;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setRoomList(ArrayList<Room> newRoomList){
        this.roomList = newRoomList;
    }

    public void hireEmployee(Employee employee){
        this.employeeList.add(employee);
    }

    public void fireEmployee (Employee employee){
        this.employeeList.remove(employee);
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
    public boolean bookRooms(ArrayList <Guest> guestsList, double budget){
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
        
        ArrayList<Room> roomsForBooking = new ArrayList<Room>();
        int counter = 0;
        for (Room room : affordableRooms){
            if (counter >= guestsList.size()){
                break;
            }
            roomsForBooking.add(room);
            counter = counter + room.getOccupancy();
        }
        if (counter <= guestsList.size()){
            return false;
        }

        double totalRoomPrice = 0;
        for (Room room : roomsForBooking){
            totalRoomPrice = totalRoomPrice + room.getPrice();
        }
        if (budget < totalRoomPrice){
            return false;
        }

        for (Room room : roomsForBooking){
            room.setOccupied(true);
        }
        int guestsInRooms=0;
        
        for (Room room : roomsForBooking){
            room.setOccupied(true);
            for (int i = 0; i<room.getOccupancy(); i++){
                if (guestsList.contains(guestsList.get(guestsInRooms+i))){
                    room.addGuest(guestsList.get(guestsInRooms+i));
                    guestsInRooms++;
                }
            }
        }
        return true;

    }


///for booking, check whether romms available
//loop over room list and fill out all available rooms
//sort available roomlist from lowest to highest price
//iterate through list and see how many rooms you need for no ppl in booking
    
}