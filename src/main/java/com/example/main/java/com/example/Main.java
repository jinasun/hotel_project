package main.java.com.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Hotel pitbull = new Hotel("APCSA");
        Room economyRoom = new Room(2, 420,false);
        Room deluxeRoom = new Room(2, 6900,false);
        Room theseRoom = new Room(2, 12345,false);
        ArrayList <Room> theBestList = new ArrayList <Room>();
        
        theBestList.add(economyRoom);
        theBestList.add(deluxeRoom);
        theBestList.add(theseRoom);
        pitbull.setRoomList(theBestList);
        
        System.out.println(pitbull.getName());
        for (Room room: pitbull.getRoomList()){
            System.out.println(room.getOccupancy());
            System.out.println(room.getPrice());
            System.out.println(room.isOccupied());
        }

        System.out.println(pitbull.bookRooms(4,370));
    }
    
}
